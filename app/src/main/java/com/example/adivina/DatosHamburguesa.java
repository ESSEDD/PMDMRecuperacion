package com.example.adivina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DatosHamburguesa extends AppCompatActivity {

    private TextView txtTipoCarne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_hamburguesa);
        txtTipoCarne = findViewById(R.id.txtPrecio2);

        Intent i = getIntent();
        String txtCarne = i.getStringExtra("keyCarne");
        String txtPollo = i.getStringExtra("keyPollo");
        float txtPrecio = i.getFloatExtra("keyPrecio", 0);
        txtTipoCarne.setText(txtCarne);

    }
}