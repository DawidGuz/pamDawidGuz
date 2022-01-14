package com.example.zaliczenie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityJeden extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jeden);

        Button FirstToast = findViewById(R.id.button_toast);

        FirstToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ActivityJeden.this,"Ta aktywnosc nie jest skonczona",
                        Toast.LENGTH_SHORT).show();

            }
        });
    }
}