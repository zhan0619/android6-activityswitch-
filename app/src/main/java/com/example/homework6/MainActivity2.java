package com.example.homework6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button button = (Button)  findViewById(R.id.button);
        button.setOnClickListener((v) -> {
            Intent intent = new Intent();
            intent.setClass(MainActivity2.this, MainActivity.class);
            startActivity(intent);
        });
    }
}