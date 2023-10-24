package com.example.mylearningapplicationplanets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.mylearningapplicationplanets.model.Planet;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<Planet> planetArrayList;
    MyCustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listView);
        planetArrayList=new ArrayList<Planet>();

        planetArrayList.add(new Planet("Earth", 1, R.drawable.earth));
        planetArrayList.add(new Planet("Mercury", 0, R.drawable.mercury));
        planetArrayList.add(new Planet("Venus", 0, R.drawable.venus));
        planetArrayList.add(new Planet("Mars", 2, R.drawable.mars));
        planetArrayList.add(new Planet("Jupiter", 2, R.drawable.jupiter));
        planetArrayList.add(new Planet("Mars", 79, R.drawable.mars));
        planetArrayList.add(new Planet("saturn", 83, R.drawable.saturn));
        planetArrayList.add(new Planet("uranus", 27, R.drawable.uranus));
        planetArrayList.add(new Planet("neptune", 14, R.drawable.neptune));

        adapter = new MyCustomAdapter( getApplicationContext(),planetArrayList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Planet Name:"+adapter.getItem(position).getName(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}