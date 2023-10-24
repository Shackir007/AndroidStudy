package com.example.mylearncounterapplication;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    Button btnCounter;
    TextView txtViewCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.btnCounter=findViewById(R.id.btnCounter);
        this.txtViewCounter=findViewById(R.id.txtViewCounter);

        this.btnCounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtViewCounter.setText(""+incrementCounter(Integer.parseInt(txtViewCounter.getText().toString())));
            }
        });
    }

    private int incrementCounter(int count){
        return ++count;
    }
}