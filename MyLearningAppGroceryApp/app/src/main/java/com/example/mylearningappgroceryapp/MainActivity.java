package com.example.mylearningappgroceryapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.mylearningappgroceryapp.model.Item;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MyClickListener {
    RecyclerView recyclerView;
    List<Item> itemList;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);
        itemList=new ArrayList<Item>();
        itemList.add(new Item(R.drawable.fruit, "Fruits","Fresh Fruits from garden"));
        itemList.add(new Item(R.drawable.vegitables, "Vegitables","Delicious Vegitables"));
        itemList.add(new Item(R.drawable.bread, "Bread","Bread, Wheat and Beans"));
        itemList.add(new Item(R.drawable.beverage, "Beverage","Juice, Tea, Coffee and Soda"));
        itemList.add(new Item(R.drawable.milk, "Milk","Milk, Shake and Yogurt"));
        itemList.add(new Item(R.drawable.popcorn, "Snacks","Pop corn, Donuts and Drinks"));

        itemList.add(new Item(R.drawable.fruit, "Fruits-2","Fresh Fruits from garden"));
        itemList.add(new Item(R.drawable.vegitables, "Vegitables-2","Delicious Vegitables"));
        itemList.add(new Item(R.drawable.bread, "Bread-2","Bread, Wheat and Beans"));
        itemList.add(new Item(R.drawable.beverage, "Beverage-2","Juice, Tea, Coffee and Soda"));
        itemList.add(new Item(R.drawable.milk, "Milk-2","Milk, Shake and Yogurt"));
        itemList.add(new Item(R.drawable.popcorn, "Snacks-2","Pop corn, Donuts and Drinks"));

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        //StaggeredGridLayoutManager gridLayoutManager=new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        myAdapter=new MyAdapter(itemList);
        myAdapter.setItemClickListener(this);
        recyclerView.setAdapter(myAdapter);

    }

    @Override
    public void onMyClick(View view, int position) {
        Toast.makeText(this, "Clicked View is "+itemList.get(position).getItemName(), Toast.LENGTH_SHORT).show();
    }
}