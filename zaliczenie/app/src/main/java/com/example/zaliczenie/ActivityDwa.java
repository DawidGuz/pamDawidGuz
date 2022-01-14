package com.example.zaliczenie;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityDwa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dwa);

        Button ZlotyNaEuro = findViewById(R.id.button_oblicz_euro);
        Button ZlotyNaDolary = findViewById(R.id.button_oblicz_dolary);

        ZlotyNaEuro.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                EditText wartosc = findViewById(R.id.editTextWartosc);
                TextView wynik = findViewById(R.id.viewWynik);
                double kwota = Double.parseDouble(wartosc.getText().toString()) * 4.54;
                double zaokragla = Math.round(kwota * 100) / 100.0;
                wynik.setText(""+zaokragla);
            }
        });

        ZlotyNaDolary.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                EditText wartosc = findViewById(R.id.editTextWartosc);
                TextView wynik = findViewById(R.id.viewWynik);
                double kwota = Double.parseDouble(wartosc.getText().toString()) * 3.98;
                double zaokr = Math.round(kwota * 100) / 100.0;
                wynik.setText("" + zaokr);
            }
        });
    }


}