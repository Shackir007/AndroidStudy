package com.example.mylearningappdatabinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.mylearningappdatabinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    //Shackir - Binding Class will be automatically created when we use databinding
    ActivityMainBinding activityMainBinding;
    MyClickHandler myClickHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Person person1=new Person("Shackir","Email@domain.com");

        activityMainBinding= DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setPerson(person1);

        myClickHandler=new MyClickHandler(getApplicationContext());
        activityMainBinding.setClickHandler(myClickHandler);

    }
}