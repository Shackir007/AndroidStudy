package com.example.mylearningappsportsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.mylearningappsportsapp.model.Sports;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MyItemClickListener{
    List<Sports> sportsList;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);

        sportsList = new ArrayList<Sports>();
        sportsList.add(new Sports(R.drawable.football, "Football"));
        sportsList.add(new Sports(R.drawable.basketball, "Basketball"));
        sportsList.add(new Sports(R.drawable.ping, "Ping"));
        sportsList.add(new Sports(R.drawable.tennis, "Tennis"));
        sportsList.add(new Sports(R.drawable.volley, "Volley"));
        sportsList.add(new Sports(R.drawable.football, "FoosBall"));

        MyAdapter myAdapter= new MyAdapter(sportsList);
        //recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));
        recyclerView.setAdapter(myAdapter);

        myAdapter.setItemClickListener(this);
    }

    @Override
    public void onMyItemClickListener(View view, int position) {
        Toast.makeText(this, "Item clicked is :"+this.sportsList.get(position).getTitleSport(), Toast.LENGTH_SHORT).show();
    }
}