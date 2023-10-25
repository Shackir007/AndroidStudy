package com.example.mylearningappdatabinding;

import android.widget.BaseAdapter;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.library.baseAdapters.BR;

public class Person extends BaseObservable {

    String name;
    String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);//Shackir-BR is available for each Bindable property. we need to @Bindable for getName method
    }

    public String getEmail() {
        return email;
    }

}
