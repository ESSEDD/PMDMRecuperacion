package com.example.adivina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class startActivityForResult2 extends AppCompatActivity {

    private Button boton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_for_result2);
         boton1 = findViewById(R.id.btnUno);

         boton1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent();
                 intent.putExtra("keyPrueba","1");
                 setResult(RESULT_OK,intent);
             }
         });

    }
}