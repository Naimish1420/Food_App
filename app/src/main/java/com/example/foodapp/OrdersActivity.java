package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.foodapp.adapters.Oderadapter;
import com.example.foodapp.databinding.ActivityOrdersBinding;
import com.example.foodapp.models.Ordersmodels;

import java.util.ArrayList;


public class OrdersActivity extends AppCompatActivity {

    ActivityOrdersBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityOrdersBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        ArrayList<Ordersmodels> list = new ArrayList<>();
        list.add(new Ordersmodels(R.drawable.burger, "burger ","60","45348754564"));
        //list.add(new Ordersmodels(R.drawable.grassfoodBeef, "grassfoodbeaf ","800","45348754565"));
        list.add(new Ordersmodels(R.drawable.paratha, "paratha ","400","45348754566"));
        list.add(new Ordersmodels(R.drawable.pizza, "pizza ","350","45348754567"));
        list.add(new Ordersmodels(R.drawable.sizler, "sizler ","350","45348754568"));
        //list.add(new Ordersmodels(R.drawable.grassfoodBeef, "grassfoodbeaf ","800","45348754569"));
        list.add(new Ordersmodels(R.drawable.burger, "burger ","60","45348754570"));
        //list.add(new Ordersmodels(R.drawable.grassfoodBeef, "grassfoodbeaf ","800","45348754571"));
        list.add(new Ordersmodels(R.drawable.pizza, "pizza ","350","45348754572"));
        list.add(new Ordersmodels(R.drawable.sizler, "sizler ","350","45348754573"));
        list.add(new Ordersmodels(R.drawable.paratha, "paratha ","400","45348754574"));

        Oderadapter adapter = new Oderadapter(list,this);
        binding.orderactivity.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.orderactivity.setLayoutManager(layoutManager);
    }
}