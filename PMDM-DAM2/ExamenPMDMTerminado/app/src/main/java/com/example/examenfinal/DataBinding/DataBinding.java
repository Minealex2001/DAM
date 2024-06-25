package com.example.examenfinal.DataBinding;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class DataBinding {
    @BindingAdapter("paletteImage")
    public static void bindLoadImagePalette(ImageView view, String url) {
        Glide.with(view.getContext())
                .load(url)
                .centerCrop()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(view);
    }
}
