package com.example.mylearningapplicationintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_GoToSecond;
    Button btn_amazon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_GoToSecond=findViewById(R.id.btn_GoToSecond);
        btn_GoToSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSecondActivity();
            }
        });

        btn_amazon=findViewById(R.id.btn_amazon);
        btn_amazon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToAmazon();
            }
        });

    }

    private void goToAmazon() {
        Uri amazonUri=Uri.parse("https://www.amazon.in/");
        Intent intent=new Intent(Intent.ACTION_VIEW, amazonUri);
        startActivity(intent);
    }

    //Explicit Intent
    protected void goToSecondActivity(){
        Intent intent=new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}