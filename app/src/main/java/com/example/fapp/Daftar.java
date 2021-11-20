package com.example.fapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Daftar extends AppCompatActivity {

    TextView tvMasuk, backLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        backLogin = findViewById(R.id.backLogin);
        tvMasuk = findViewById(R.id.tvMasuk);

        tvMasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Daftar.this, Login.class);
                startActivity(i);
                finish();
            }
        });

        backLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Daftar.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}