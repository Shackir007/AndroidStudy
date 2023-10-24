package com.example.mylearningappvolumecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ChildActivity extends AppCompatActivity {
    String shapeType;
    Button btn;
    EditText editInputText1, editInputText2, editInputText3;
    TextView volumeOutputTextView, titleTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);
        Intent intent = getIntent();
        shapeType=intent.getStringExtra("type");

        titleTextView=findViewById(R.id.title);
        btn=findViewById(R.id.volumeConversionButton);
        editInputText1=findViewById(R.id.editInputText1);
        editInputText2=findViewById(R.id.editInputText2);
        editInputText3=findViewById(R.id.editInputText3);
        volumeOutputTextView=findViewById(R.id.volumeOutputTextView);

        if (shapeType.toUpperCase().equals("SPHERE")){
            titleTextView.setText("Sphere Volume");
            editInputText1.setVisibility(View.GONE);
            editInputText2.setVisibility(View.VISIBLE);
            editInputText3.setVisibility(View.GONE);
            editInputText2.setHint("Enter Radius in meter(m)");
        } else if (shapeType.toUpperCase().equals("CUBE")) {
            titleTextView.setText("Cube Volume");
            editInputText1.setVisibility(View.GONE);
            editInputText2.setVisibility(View.VISIBLE);
            editInputText3.setVisibility(View.GONE);
            editInputText2.setHint("Enter Side length in meter(m)");
        }else if (shapeType.toUpperCase().equals("CYLINDER")) {
            titleTextView.setText("Cylinder Volume");
            editInputText1.setVisibility(View.GONE);
            editInputText2.setVisibility(View.VISIBLE);
            editInputText3.setVisibility(View.VISIBLE);
            editInputText2.setHint("Enter radius length in meter(m)");
            editInputText3.setHint("Enter height in meter(m)");
        }else if (shapeType.toUpperCase().equals("PRISM")) {
            titleTextView.setText("Prism Volume");
            editInputText1.setVisibility(View.VISIBLE);
            editInputText2.setVisibility(View.VISIBLE);
            editInputText3.setVisibility(View.VISIBLE);
            editInputText1.setHint("Enter length in meter(m)");
            editInputText2.setHint("Enter width in meter(m)");
            editInputText3.setHint("Enter height in meter(m)");
        }

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int input1,input2,input3;
                double volume = 0;

                input1 = editInputText1.getVisibility()==View.VISIBLE? Integer.parseInt(editInputText1.getText().toString()):0;
                input2 = editInputText2.getVisibility()==View.VISIBLE? Integer.parseInt(editInputText2.getText().toString()):0;
                input3 = editInputText3.getVisibility()==View.VISIBLE? Integer.parseInt(editInputText3.getText().toString()):0;

                if (shapeType.toUpperCase().equals("SPHERE")) {
                    volume = (input2 ^ 3) * 3 / 4 * 3.14;
                } else if (shapeType.toUpperCase().equals("CUBE")) {
                    volume = input2 ^ 3;
                } else if (shapeType.toUpperCase().equals("CYLINDER")) {
                    volume = (input2 ^ 2) * 3.14 * input3;
                } else if (shapeType.toUpperCase().equals("PRISM")) {
                    volume = input1 * input2 * input3;
                }
                volumeOutputTextView.setText("" + volume + " m^3");
            }
        });

    }
}