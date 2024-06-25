package com.example.pruebaexamendi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.material.chip.Chip;

public class PlacesInTheWor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_in_the_wor);
        Chip chip = findViewById(R.id.chip);
        Chip chip2 = findViewById(R.id.chip2);
        Chip chip3 = findViewById(R.id.chip3);
        Chip chip4 = findViewById(R.id.chip4);
        Spinner spinner = findViewById(R.id.spinner);

        chip.setOnClickListener(v -> {
            chip.setChecked(true);
            chip2.setChecked(false);
            chip3.setChecked(false);
            chip4.setChecked(false);
            Toast.makeText(this, "Has seleccionado Hotels", Toast.LENGTH_SHORT).show();
        });
        chip2.setOnClickListener(v -> {
            chip.setChecked(false);
            chip2.setChecked(true);
            chip3.setChecked(false);
            chip4.setChecked(false);
            Toast.makeText(this, "Has seleccionado Restaurants", Toast.LENGTH_SHORT).show();
        });
        chip3.setOnClickListener(v -> {
            chip.setChecked(false);
            chip2.setChecked(false);
            chip3.setChecked(true);
            chip4.setChecked(false);
            Toast.makeText(this, "Has seleccionado Museums", Toast.LENGTH_SHORT).show();
        });
        chip4.setOnClickListener(v -> {
            chip.setChecked(false);
            chip2.setChecked(false);
            chip3.setChecked(false);
            chip4.setChecked(true);
            Toast.makeText(this, "Has seleccionado Monuments", Toast.LENGTH_SHORT).show();
        });
    }
}