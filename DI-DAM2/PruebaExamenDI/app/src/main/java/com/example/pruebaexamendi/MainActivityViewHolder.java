package com.example.pruebaexamendi;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivityViewHolder extends RecyclerView.ViewHolder {
    protected ImageView imageView;
    protected TextView textView;
    protected Button buttonaccept;
    protected Button buttoncancel;


    public MainActivityViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageView);
        textView = itemView.findViewById(R.id.textView);
        buttonaccept = itemView.findViewById(R.id.buttonaccept);
        buttoncancel = itemView.findViewById(R.id.buttoncancel);
    }
}
