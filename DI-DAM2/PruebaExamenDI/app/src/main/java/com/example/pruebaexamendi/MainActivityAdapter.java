package com.example.pruebaexamendi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MainActivityAdapter extends RecyclerView.Adapter<MainActivityViewHolder>{

    private final List<CardMain> cards;

    public MainActivityAdapter(List<CardMain> cards) {
        this.cards = cards;
    }

    @NonNull
    @Override
    public MainActivityViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.main_viewholder_layout, parent, false);
        return new MainActivityViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainActivityViewHolder holder, int position) {
        String name = cards.get(position).getName();
        int image = cards.get(position).getImage();

        holder.textView.setText(name);
        holder.imageView.setImageResource(image);
    }

    @Override
    public int getItemCount() {
        return cards.size();
    }
}
