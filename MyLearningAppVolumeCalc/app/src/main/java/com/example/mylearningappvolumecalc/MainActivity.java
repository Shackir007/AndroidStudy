package com.example.mylearningappvolumecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.example.mylearningappvolumecalc.model.Shape;
import com.example.mylearningappvolumecalc.presenter.MyCustomGridAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Shape> shapeArrayList;
    GridView gridView;
    MyCustomGridAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.gridView=findViewById(R.id.gridView);
        this.shapeArrayList=new ArrayList<Shape>();
        this.shapeArrayList.add(new Shape(R.drawable.sphere,"sphere"));
        this.shapeArrayList.add(new Shape(R.drawable.cylinder,"cylinder"));
        this.shapeArrayList.add(new Shape(R.drawable.cube,"cube"));
        this.shapeArrayList.add(new Shape(R.drawable.prism,"prism"));

        adapter=new MyCustomGridAdapter(getApplicationContext(),shapeArrayList );
        gridView.setAdapter(adapter);
        //gridView.setNumColumns(2); //set number of columns in xml

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Selected item is "+adapter.getItem(position).getText().toString(), Toast.LENGTH_SHORT).show();

                String shape=adapter.getItem(position).getText().toString();
                openChildActivity(shape);
            }
        });
    }

    void openChildActivity(String shape){
        Intent intent=new Intent(getApplicationContext(), ChildActivity.class);

        if (shape.toUpperCase().equals("SPHERE") || shape.toUpperCase().equals("CUBE")||shape.toUpperCase().equals("CYLINDER") || shape.toUpperCase().equals("PRISM")){
            intent.putExtra("type",shape);
        } else {
            Toast.makeText(MainActivity.this, shape+" doesnot have any implementation", Toast.LENGTH_SHORT).show();
            return;
        }

        startActivity(intent);
    }
}