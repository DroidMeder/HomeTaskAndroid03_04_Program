package com.example.hometaskandroid03_04_program;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    private final TextView textName;
    private final ImageView imageView;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageView);
        textName=itemView.findViewById(R.id.textView);
    }

    public void bind(String name, Integer bitmap){
        textName.setText(name);
        imageView.setImageResource(bitmap);
    }

}
