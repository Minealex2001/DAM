package com.example.pruebaexamendi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<CardMain> cards = new ArrayList<>();
        cards.add(new CardMain("Card 1", R.drawable.image1));
        cards.add(new CardMain("Card 2", R.drawable.image2));
        cards.add(new CardMain("Card 3", R.drawable.image3));
        cards.add(new CardMain("Card 4", R.drawable.image4));
        cards.add(new CardMain("Card 5", R.drawable.image5));
        cards.add(new CardMain("Card 6", R.drawable.image6));
        cards.add(new CardMain("Card 7", R.drawable.image7));
        cards.add(new CardMain("Card 8", R.drawable.image8));
        cards.add(new CardMain("Card 9", R.drawable.image9));
        Toolbar toolbar = findViewById(R.id.toolbar2);
        setSupportActionBar(toolbar);



        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        MainActivityAdapter adapter = new MainActivityAdapter(cards);

        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        recyclerView.setAdapter(adapter);

        FloatingActionButton fab = findViewById(R.id.floatingActionButton);
        fab.setOnClickListener(v -> {
            Intent intent = new Intent(this, PlacesInTheWor.class);
            startActivity(intent);
        });
    }

    private void setSupportActionBar(Toolbar toolbar) {

    }
}