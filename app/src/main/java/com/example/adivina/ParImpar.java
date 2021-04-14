package com.example.adivina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class ParImpar extends AppCompatActivity {

    private Button botonPar;
    private Button botonImpar;
    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_par_impar);
        botonPar = findViewById(R.id.botonPar);
        botonImpar = findViewById(R.id.botonImpar);
        texto = findViewById(R.id.texto);




    }
}