package com.if3b.tesulang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getSupportActionBar().setTitle("Coba Mini tes");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void tampil(View view)
    {
        Toast.makeText(this, "Kamu Apa Kabar?", Toast.LENGTH_SHORT).show();
    }
}