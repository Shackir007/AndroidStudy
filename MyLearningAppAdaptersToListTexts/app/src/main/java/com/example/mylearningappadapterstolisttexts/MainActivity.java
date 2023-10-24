package com.example.mylearningappadapterstolisttexts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] listOfCourses={"Data Science", "Artificial Intelligence", "software testing", "BigData", "Java", "SAP", "SAS", "Fullstack", "CyberSecurity", "cloud computing", "Web Development", "Mobile App Development"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView=findViewById(R.id.listView);
        //Eg:1
        // Connect datasource to listView via Adapter
        //ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,listOfCourses);
        //Eg:2
        // Connect datasource to listView via Custom created Adapter
        MyCustomAdapter adapter = new MyCustomAdapter(getApplicationContext(), listOfCourses);

        listView.setAdapter(adapter);
    }
}