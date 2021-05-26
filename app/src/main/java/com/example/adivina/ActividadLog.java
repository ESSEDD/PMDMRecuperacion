package com.example.adivina;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActividadLog extends AppCompatActivity {
    private Button btnEnviar;
    String myMessage = "Hola mundo!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_log);

        btnEnviar = findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Una vez receptemos el evento, usaremos Bundle e Intent para pasar datos de una Activity a otra
                // Inicializas el Bundle
                Bundle bundle = new Bundle();

                // Inicializas el Intent
                Intent intent = new Intent(v.getContext(), fragmentLog.class);

                // Información del EditText
                EditText editText = (EditText) findViewById(R.id.txtCampo);
                String texto = editText.getText().toString();

                // Agregas la información del EditText al Bundle
                bundle.putString("textFromActivityA", texto);
                // Agregas el Bundle al Intent e inicias ActivityB
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        }
}