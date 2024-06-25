package com.alejandro.examendi;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Activity_hotels extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        List<String> names = new ArrayList<>();
        names.add("Hotel 1");
        names.add("Hotel 2");
        names.add("Hotel 3");
        names.add("Hotel 4");
        names.add("Hotel 5");

        List<String> addresses = new ArrayList<>();
        addresses.add("Address 1");
        addresses.add("Address 2");
        addresses.add("Address 3");
        addresses.add("Address 4");
        addresses.add("Address 5");

        List<Integer> images = new ArrayList<>();
        images.add(R.drawable.hotel1);
        images.add(R.drawable.hotel2);
        images.add(R.drawable.hotel3);
        images.add(R.drawable.hotel4);
        images.add(R.drawable.hotel5);

        RecyclerView recyclerView = findViewById(R.id.recyclerlist);
        hotels_adapter adapter = new hotels_adapter(names, addresses, images);

        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(1, LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.toolbar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        return super.onOptionsItemSelected(item);
    }


}