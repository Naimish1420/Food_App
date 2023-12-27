package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.foodapp.adapters.MainAdapter;
import com.example.foodapp.databinding.ActivityMainBinding;
import com.example.foodapp.models.MainModels;

import java.sql.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
        ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<MainModels> list = new ArrayList<>();
        list.add(new MainModels(R.drawable.burger,"Burger","70","o McDonald's the McAloo Tikki consists of a toasted bun with a samosa-spiced veggie patty made from potatoes and peas. It's topped with fresh red onions, sliced tomato, and an egg-free creamy tomato mayo."));
        list.add(new MainModels(R.drawable.pizza,"Pizza","350","pizza, dish of Italian origin consisting of a flattened disk of bread dough topped with some combination of olive oil, oregano, tomato, olives, mozzarella or other cheese, and many other ingredients, baked quickly—usually, in a commercial setting, using a wood-fired oven heated to a very high temperature—and served hot"));
        list.add(new MainModels(R.drawable.sizler,"Sizler","350","A sizzler is essentially a single dish meal, in which meats and vegetables are cooked in a sauce on a hot metal plate. The dish has been described as an \"open-roasted, grilled or shallow fried piece of meat, chicken, fish or vegetable patty, served on an oval shaped metal or stone hot plate, kept on a wooden base."));
        //list.add(new MainModels(R.drawable.grassfoodBeef,"GrassBeaf","800","To most in the industry, the term grass-fed implies the individual is also grass-finished, meaning that the animal is brought to a desired carcass weight and yield grade (such as prime, choice and select) via a non-grain, forage-based diet."));
        list.add(new MainModels(R.drawable.paratha,"Paratha","400","Paratha (Flaky South Asian Flatbread) Recipe\n" +
                "Crispy, chewy, buttery, and comprised of innumerable flaky layers, this flatbread complements any dish and can be eaten with any meal."));

        MainAdapter adapter = new MainAdapter(this, list);
        binding.mainRecycleview.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.mainRecycleview.setLayoutManager(layoutManager);






    }
}