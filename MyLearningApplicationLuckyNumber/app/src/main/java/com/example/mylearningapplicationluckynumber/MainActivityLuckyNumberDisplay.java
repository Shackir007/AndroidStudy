package com.example.mylearningapplicationluckynumber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivityLuckyNumberDisplay extends AppCompatActivity {
    TextView textView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_lucky_number_display);

        textView=findViewById(R.id.textView);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name").toString();
        Toast.makeText(this, "Passed value is:"+name, Toast.LENGTH_SHORT).show();
        int luckyNumber=generateLuckyNumber();
        textView.setText(""+luckyNumber);

        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shareData(name, luckyNumber);
            }
        });
    }

    private void shareData(String name, int luckyNumber) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, "Hi there, My Lucky Number is "+luckyNumber);
        intent.putExtra(Intent.EXTRA_SUBJECT, name+" got lucky today");
        startActivity(Intent.createChooser(intent, "Chose platform"));
    }

    protected int generateLuckyNumber(){
        return new Random().nextInt(1000);
    }
}