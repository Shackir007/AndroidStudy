package com.example.mylearningapplicationluckynumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnGenerate=findViewById(R.id.btnGenerate);
        TextView textViewName=findViewById(R.id.editTextName);
        btnGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textViewName.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Please Enter Your Name", Toast.LENGTH_SHORT).show();
                }else{
                    String name=textViewName.getText().toString();
                    Toast.makeText(MainActivity.this, "Name:"+name, Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(getApplicationContext(), MainActivityLuckyNumberDisplay.class);

                    intent.putExtra("name",name);
                    startActivity(intent);
                }
            }
        });
    }
}