package com.if3b.tesulang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tvHalo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        getSupportActionBar().setTitle("Selamat datang");

        tvHalo = findViewById(R.id.tv_halo);

        Intent terima = getIntent();
        String yhalo = terima.getStringExtra("xhalo");
        tvHalo.setText(yhalo);
    }
}