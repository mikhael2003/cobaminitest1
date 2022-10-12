package com.if3b.tesulang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button Btnpindah ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

Btnpindah = findViewById(R.id.btn_pindah);

        getSupportActionBar().setTitle("Coba Mini tes");

 Btnpindah.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View view) {
         if (Btnpindah == null) {

         } {
             Intent pindah = new Intent(MainActivity.this, SecondActivity.class);
             startActivity(pindah);
         }
     }
 });

    }
    public void tampil(View view)
    {
        Toast.makeText(this, "Kamu Apa Kabar?", Toast.LENGTH_SHORT).show();
    }
}