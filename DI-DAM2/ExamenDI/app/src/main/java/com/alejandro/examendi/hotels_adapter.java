package com.alejandro.examendi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class hotels_adapter extends RecyclerView.Adapter<hotels_viewholder>{

    private final List<String> names;
    private final List<String> addresses;
    private final List<Integer> images;


    public hotels_adapter(List<String> names, List<String> addresses, List<Integer> images) {
        this.names = names;
        this.addresses = addresses;
        this.images = images;
    }

    @NonNull
    @Override
    public hotels_viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.hotels_recycler, parent, false);
        return new hotels_viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull hotels_viewholder holder, int position) {
        String name = names.get(position);
        String address = addresses.get(position);
        Integer image = images.get(position);

        holder.name.setText(name);
        holder.address.setText(address);
        holder.image.setImageResource(image);
        holder.heart.setImageResource(R.drawable.icono3);

        holder.heart.setOnClickListener(v -> {
            Toast.makeText(v.getContext(), "Se ha añadido "+ holder.name.getText().toString() + " a favoritos", Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public int getItemCount() {
        return images != null && names != null && addresses != null ? images.size() : 0;
    }

}
