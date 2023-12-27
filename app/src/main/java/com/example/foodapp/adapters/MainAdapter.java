package com.example.foodapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodapp.R;
import com.example.foodapp.models.MainModels;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.viewholder> {
    Context context;
    ArrayList<MainModels> list;

    public MainAdapter(Context context, ArrayList<MainModels> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sample_mainfood,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        final  MainModels models = list.get(position);
        holder.foodimage.setImageResource(models.getImage());
        holder.name.setText(models.getName());
        holder.price.setText(models.getPrice());
        holder.decryption.setText(models.getDescription());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {
        ImageView foodimage;
        TextView name,price,decryption;
        public viewholder(@NonNull View itemView) {
            super(itemView);
            foodimage = itemView.findViewById(R.id.imageView);
            name = itemView.findViewById(R.id.textView);
            price  = itemView.findViewById(R.id.textviewprice);
            decryption = itemView.findViewById(R.id.textviewdecription);


        }
    }
}
