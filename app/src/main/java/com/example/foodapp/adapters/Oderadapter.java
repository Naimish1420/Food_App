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
import com.example.foodapp.models.Ordersmodels;

import java.util.ArrayList;

public class Oderadapter extends RecyclerView.Adapter<Oderadapter.viewholder> {
    ArrayList<Ordersmodels> list;
    Context context;

    public Oderadapter(ArrayList<Ordersmodels> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sampleorder,parent,false) ;
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        final  Ordersmodels mode1 = list.get(position);
        holder.orderimage.setImageResource(mode1.getOrdrimage());
        holder.solditeamname.setText(mode1.getSoldItamname());
        holder.ordernmber.setText(mode1.getOrdernumber());
        holder.price.setText(mode1.getPrice());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {
        ImageView orderimage;
        TextView solditeamname,ordernmber,price;
        public viewholder(@NonNull View itemView) {

            super(itemView);
            orderimage = itemView.findViewById(R.id.orderimage);
            solditeamname = itemView.findViewById(R.id.ordername);
            ordernmber = itemView.findViewById(R.id.ordernumbers);
            price = itemView.findViewById(R.id.orderhistorypricevalue);



        }
    }
}
