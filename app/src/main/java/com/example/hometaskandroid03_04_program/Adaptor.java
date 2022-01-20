package com.example.hometaskandroid03_04_program;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashMap;

public class Adaptor extends RecyclerView.Adapter<ViewHolder> {

    ArrayList<String> names;
    ArrayList<Integer> referenceOfImages;

    public Adaptor(ArrayList<String> names, ArrayList<Integer> referenceOfImages) {
        this.names = names;
        this.referenceOfImages = referenceOfImages;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate
                (R.layout.items, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.bind(names.get(position), referenceOfImages.get(position));
    }

    @Override
    public int getItemCount() {
        return names.size();
    }
}

