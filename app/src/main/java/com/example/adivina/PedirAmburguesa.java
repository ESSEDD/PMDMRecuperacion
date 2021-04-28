package com.example.adivina;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.RadioButton;
import android.widget.Toast;
import android.widget.VideoView;

public class PedirAmburguesa extends AppCompatActivity {
    //crap design
    //crear una nueva actividad (statactivity(o intent) (tipo carne etc))
    //el fin es pintar una hamburguesa en una actividad nueva
    //Esto es una prueba de PUSH sin commit
    private float precio;
    private Button btnPedir;
    private RadioButton rbCarne;
    private RadioButton rbPollo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedir_amburguesa);

        btnPedir = findViewById(R.id.btnPedir);
        rbCarne = findViewById(R.id.rbCarne);
        rbPollo = findViewById(R.id.rbPollo);

        btnPedir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pollo = rbCarne.getText().toString();
                String carne = rbCarne.getText().toString();

                if(rbCarne.isChecked())
                    precio =7;
                else if (rbPollo.isChecked())
                    precio =5;


                openDatosHamburguesa();
            }
        });



        //precio = 0f;

        //AlertDialog.Builder builder = new AlertDialog.Builder(this);
        //builder.setTitle("Pedido");
        //builder.setMessage("Configura tu hamburguesa");
        //builder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
        //    @Override
        //    public void onClick(DialogInterface dialog, int which) {
        //    }
        //});

       // btnCarne.setOnClickListener(
       //         new View.OnClickListener() {
       //             public void onClick(View v) {
       //                 Toast.makeText(getApplicationContext(),"Has seleccionado Carne",Toast.LENGTH_SHORT).show();
       //                 precio += 7f;
       //             }
       //         }
       // );

    }

    public void openDatosHamburguesa() {
        Intent intent = new Intent(this, DatosHamburguesa.class);
        intent.putExtra("keyPrecio", precio);
        String pollo = rbCarne.getText().toString();
        String carne = rbCarne.getText().toString();

        if(rbCarne.isChecked())
            intent.putExtra("keyCarne", carne);
        else if (rbPollo.isChecked())
            intent.putExtra("keyPollo", pollo);


        startActivity(intent);
    }

}