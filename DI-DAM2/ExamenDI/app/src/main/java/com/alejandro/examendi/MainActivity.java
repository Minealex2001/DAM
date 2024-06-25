package com.alejandro.examendi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button login_button = findViewById(R.id.loginbutton);

        login_button.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Activity_hotels.class);
            startActivity(intent);
        });
    }
}