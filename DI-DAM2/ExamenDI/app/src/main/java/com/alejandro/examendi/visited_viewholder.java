package com.alejandro.examendi;

import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class visited_viewholder extends RecyclerView.ViewHolder {
    ImageView image;
    RatingBar ratingBar;

    public visited_viewholder(@NonNull View itemView) {
        super(itemView);
        image = itemView.findViewById(R.id.hotelvisitedimage);
        ratingBar = itemView.findViewById(R.id.ratingBar);
    }
}
