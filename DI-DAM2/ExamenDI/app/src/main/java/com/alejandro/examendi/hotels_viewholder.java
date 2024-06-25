package com.alejandro.examendi;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class hotels_viewholder extends RecyclerView.ViewHolder {
    TextView name;
    TextView address;
    ImageView image;
    ImageButton heart;

    public hotels_viewholder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.hotelname);
        address = itemView.findViewById(R.id.streetname);
        image = itemView.findViewById(R.id.imagehotel);
        heart = itemView.findViewById(R.id.heart);
    }

}
