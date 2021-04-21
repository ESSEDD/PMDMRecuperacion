package com.example.adivina;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class PedirAmburguesa extends AppCompatActivity {
    //crap design
    //crear una nueva actividad (statactivity(o intent) (tipo carne etc))
    //el fin es pintar una hamburguesa en una actividad nueva
    private Button btnCarne, btnPollo, btnQuesoSi, btnQuesoNo, btnBaconSi, btnBaconNo, btnPedir, btnReset;
    private float precio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedir_amburguesa);
        precio = 0f;
        btnReset = findViewById(R.id.btnReset);
        btnCarne = findViewById(R.id.btnCarne);
        btnPollo = findViewById(R.id.btnPollo);
        btnQuesoSi = findViewById(R.id.btnQuesoSi);
        btnQuesoNo = findViewById(R.id.btnQuesoNo);
        btnBaconSi = findViewById(R.id.btnBaconSi);
        btnBaconNo = findViewById(R.id.btnBaconNo);
        btnPedir = findViewById(R.id.btnPedir);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Pedido");
        builder.setMessage("Configura tu hamburguesa");
        builder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });

        btnCarne.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(),"Has seleccionado Carne",Toast.LENGTH_SHORT).show();
                        precio += 7f;
                    }
                }
        );

        btnPollo.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(),"Has seleccionado Pollo",Toast.LENGTH_SHORT).show();
                        precio += 5f;
                    }
                }
        );

        btnQuesoSi.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(),"Has seleccionado con Queso",Toast.LENGTH_SHORT).show();
                        precio += 2f;
                    }
                }
        );

        btnQuesoNo.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(),"Has seleccionado Sin Queso",Toast.LENGTH_SHORT).show();
                    }
                }
        );

        btnBaconSi.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(),"Has seleccionado con Bacon",Toast.LENGTH_SHORT).show();
                        precio += 2f;
                    }
                }
        );

        btnBaconNo.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(),"Has seleccionado sin Bacon",Toast.LENGTH_SHORT).show();
                    }
                }
        );

        btnReset.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(),"Has eliminado todas las opciones",Toast.LENGTH_SHORT).show();
                        precio = 0f;
                    }
                }
        );

        btnPedir.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        builder.setMessage("Tu hamburguesa cuesta " + precio + " $");
                        builder.show();
                    }
                }
        );

    }
}