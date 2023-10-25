package com.example.mylearningappdatabinding;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class MyClickHandler {
    Context context;

    public MyClickHandler(Context context) {
        this.context=context;
    }

    public void onButtonClick(View view){
        Toast.makeText(context, "Button is Clicked", Toast.LENGTH_SHORT).show();
    }
}
