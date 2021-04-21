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

    private Button btnCarne, btnPollo, btnQuesoSi, btnQuesoNo, btnBaconSi, btnBaconNo, btnPedir, btnReset;
    private int precio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedir_amburguesa);
        precio = 0;
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
        builder.setMessage("Tu hamburguesa cuesta " + precio + " $");
        builder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });

        btnCarne.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(),"Has seleccionado Carne",Toast.LENGTH_SHORT).show();
                        precio += 7;
                    }
                }
        );

        btnPollo.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(),"Has seleccionado Pollo",Toast.LENGTH_SHORT).show();
                        precio += 5;
                    }
                }
        );

        btnQuesoSi.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        Toast.makeText(getApplicationContext(),"Has seleccionado con Queso",Toast.LENGTH_SHORT).show();
                        precio += 2;
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
                        precio += 2;
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
                        precio = 0;
                    }
                }
        );

        btnPedir.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        builder.show();
                    }
                }
        );

    }
}