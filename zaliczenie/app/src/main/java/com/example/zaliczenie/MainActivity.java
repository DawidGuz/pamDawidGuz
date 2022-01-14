package com.example.zaliczenie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button przycisk1 = findViewById(R.id.przyciskJeden);
        Button przycisk2 = findViewById(R.id.przyciskDwa);
        Button przycisk3 = findViewById(R.id.przyciskTrzy);

        przycisk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jeden = new Intent(MainActivity.this, ActivityJeden.class);
                startActivity(jeden);
            }
        });

        przycisk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dwa = new Intent(MainActivity.this, ActivityDwa.class);
                startActivity(dwa);
            }
        });

        przycisk3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trzy = new Intent(MainActivity.this, ActivityTrzy.class);
                startActivity(trzy);
            }
        });



        Button MainToast = findViewById(R.id.przyciskCztery);
        MainToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Ta aktywnosc nie jest skonczona",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

}