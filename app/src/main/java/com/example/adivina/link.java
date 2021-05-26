package com.example.adivina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class link extends AppCompatActivity {

    private Button btnlink;
    private Button btnCall;
    private Button btnMsg;
    private String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_link);

        btnlink = findViewById(R.id.btnlink);
        btnCall = findViewById(R.id.btnCall);
        btnMsg = findViewById(R.id.btnMsg);
        url="https://aulavirtual3.educa.madrid.org/ies.villablanca.madrid/login/index.php";

        btnlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse(url);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_CALL);
                i.setData(Uri.parse("tel:123456789"));
                startActivity(i);
            }
        });

        btnMsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_SEND);
                i.setData(Uri.parse("hola"));
                startActivity(i);
            }
        });
    }
}