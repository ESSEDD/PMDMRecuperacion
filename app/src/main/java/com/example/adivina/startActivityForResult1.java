package com.example.adivina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class startActivityForResult1 extends AppCompatActivity {

    private int REQUEST_CODE=1;
    Button btnPrimerNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_for_result1);

        btnPrimerNum = findViewById(R.id.btnPrimerNum);

        btnPrimerNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initIntent();
            }
        });

    }

    public void initIntent(){

        Intent intent = new Intent(this, startActivityForResult2.class);
        startActivityForResult(intent,REQUEST_CODE);

    }



}