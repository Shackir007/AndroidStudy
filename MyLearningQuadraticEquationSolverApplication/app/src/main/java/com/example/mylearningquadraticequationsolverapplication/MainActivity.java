package com.example.mylearningquadraticequationsolverapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.mylearningquadraticequationsolverapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activityMainBinding = DataBindingUtil.setContentView(this,
                R.layout.activity_main);

        MyEquation myEquation = new MyEquation(activityMainBinding);
        myEquation.setResult("Result is here");

        activityMainBinding.setMyEquation(myEquation);
    }
}