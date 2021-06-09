package com.example.adivina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import apiresultados.Result;
import apiresultados.ResultService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MostrarResultados extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_resultados);

        new Thread(new Runnable() {
            @Override
            public void run() {
                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl("https://raw.githubusercontent.com")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();

                ResultService servicio = retrofit.create(ResultService.class);

                Call<List<Result>> llamada = servicio.listResult();

                llamada.enqueue(new Callback<List<Result>>() {
                    @Override
                    public void onResponse(Call<List<Result>> call, Response<List<Result>> response) {
                        for(Result r: response.body()){
                            Log.d("Resultado", r.score);
                        }
                    }

                    @Override
                    public void onFailure(Call<List<Result>> call, Throwable t) {
                            Log.d("Resultado", "fallo en la peticion");
                    }
                });
            }
        }).start();


    }
}