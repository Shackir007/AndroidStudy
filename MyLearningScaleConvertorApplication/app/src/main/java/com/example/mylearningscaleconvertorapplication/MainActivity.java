package com.example.mylearningscaleconvertorapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnConvert;
    Button btnClear;
    TextView txtFiled1;
    TextView txtFiled2;
    RadioGroup radioButtons;

    RadioButton radioButton_cm_in;
    RadioButton radioButton_M_Ft;
    RadioButton radioButton_KM_Mi;

    String conversion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.btnConvert=findViewById(R.id.btn_convert);
        this.btnClear=findViewById(R.id.btn_Clear);
        this.txtFiled1=findViewById(R.id.editTextNumberDecimal);
        this.txtFiled2=findViewById(R.id.editTextNumberDecimal2);
        this.radioButtons=findViewById(R.id.radioGroup);
        this.radioButton_cm_in=findViewById(R.id.radioButton_cm_in);
        this.radioButton_M_Ft=findViewById(R.id.radioButton_M_Ft);
        this.radioButton_KM_Mi=findViewById(R.id.radioButton_KM_Mi);

        this.btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtFiled1.setText("0.0");
                txtFiled2.setText("0.0");
                radioButton_cm_in.setSelected(false);
                radioButton_M_Ft.setSelected(false);
                radioButton_KM_Mi.setSelected(false);
                radioButtons.setFocusedByDefault(true);
            }
        });

        this.btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                conversion=radioButton_cm_in.isChecked()? "CM_To_INCH":radioButton_M_Ft.isChecked()?"M_Ft":radioButton_KM_Mi.isChecked()?"KM_Mi":"None";
                Toast.makeText(MainActivity.this, "conversion value is:"+conversion+", setTextSize"+txtFiled2.getTextSize(), Toast.LENGTH_SHORT).show();

                try{
                    double value=Double.parseDouble(txtFiled1.getText().toString());
                    txtFiled2.setTextColor(Color.BLACK);
                    txtFiled2.setTextSize(24);
                    txtFiled2.setText(""+convertValue(conversion, value));
                }catch (NumberFormatException nfe){
                    txtFiled2.setTextColor(Color.RED);
                    txtFiled2.setTextSize(18);
                    txtFiled2.setText("Error-Invalid Decimal Value");
                }

            }
        });
    }
    double convertValue(String operation, double value){
        if (operation.equals("CM_To_INCH")){
            return value/2.54;
        } else if (operation.equals("M_Ft")) {
            return value*3.28084;
        } else if (operation.equals("KM_Mi")) {
            return value/1.60934;
        } else {
            return value;
        }
    }
}