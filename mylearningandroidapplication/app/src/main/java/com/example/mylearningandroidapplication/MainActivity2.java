package com.example.mylearningandroidapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    EditText editText;
    Button myBtn;
    TextView titleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        this.editText = findViewById(R.id.edittext);
        this.myBtn = findViewById(R.id.button);
        this.titleView = findViewById(R.id.title);

        this.myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputValue=editText.getText().toString();
                Toast.makeText(MainActivity2.this,
                        "Welcome "+inputValue+" to our first App",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}