package com.example.adivina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;

    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.boton1);
        b2 = findViewById(R.id.boton2);
        b3 = findViewById(R.id.boton3);
        b4 = findViewById(R.id.boton4);
        b5 = findViewById(R.id.boton5);
        b6 = findViewById(R.id.boton6);
        b7 = findViewById(R.id.boton7);
        b8 = findViewById(R.id.boton8);
        b9 = findViewById(R.id.boton9);
        b0 = findViewById(R.id.boton0);
        Evento eventoClick = new Evento();
        b1.setOnClickListener(eventoClick);
        b2.setOnClickListener(eventoClick);
        b3.setOnClickListener(eventoClick);
        b4.setOnClickListener(eventoClick);
        b5.setOnClickListener(eventoClick);
        b6.setOnClickListener(eventoClick);
        b7.setOnClickListener(eventoClick);
        b8.setOnClickListener(eventoClick);
        b9.setOnClickListener(eventoClick);
        b0.setOnClickListener(eventoClick);

    }
}

class Evento implements View.OnClickListener {
    int n = 0;
    Random rnd = new Random();
    public void onClick(View v) {
        // A onClick se le pasa como argumento el View que provoca el evento.
        // En este caso es un botón:

        Button b = (Button) v;
        b.setText("Pulsado " + n++);
    }
}

