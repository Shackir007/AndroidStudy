package com.example.mylearningquadraticequationsolverapplication;

import android.view.View;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.mylearningquadraticequationsolverapplication.databinding.ActivityMainBinding;

public class MyEquation extends BaseObservable {

    String a;
    String b;
    String c;

    String result;

    ActivityMainBinding binding;

    public MyEquation(ActivityMainBinding activityMainBinding) {
        this.binding = activityMainBinding;
    }

    public MyEquation() {
    }

    @Bindable
    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    @Bindable
    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Bindable
    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    @Bindable
    public String getResult() {
        return result;
    }

    @Bindable
    public void setResult(String result) {
        this.result = result;
        notifyPropertyChanged(BR.result);
    }

    public void solveEquation(View view){
        try {
            int a = Integer.parseInt(getA());
            int b = Integer.parseInt(getB());
            int c = Integer.parseInt(getC());

            double discriminant = b * b - 4 * a * c;
            double x1, x2;

            if (discriminant > 0) {
                x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                setResult("Result: X1=" + x1 + ", X2=" + x2);
            } else if (discriminant < 0) {
                setResult("No real roots(Complex roots)");
            } else {
                x1 = -b / (2 * a);
                setResult("Result: X=" + x1);
            }
        } catch (NumberFormatException e){
            setResult("Error: Input format is invalid/non numeric");
        }

        //binding.textViewResult.setText(getResult());
        //Shackir - Result made as 2 way binding. so update of result should auto update the UI
    }
}
