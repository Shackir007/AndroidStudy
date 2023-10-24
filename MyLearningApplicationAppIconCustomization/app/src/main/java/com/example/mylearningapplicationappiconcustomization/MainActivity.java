package com.example.mylearningapplicationappiconcustomization;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return true;//super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();

        if(itemId == R.id.menuitem1){
            Toast.makeText(getApplicationContext(), "Menu Item 1 is selected", Toast.LENGTH_SHORT).show();
        } else if (itemId == R.id.menuitem2){
            Toast.makeText(getApplicationContext(), "Menu Item 2 is selected", Toast.LENGTH_SHORT).show();
        } else if (itemId == R.id.menuitem3){
            Toast.makeText(getApplicationContext(), "Menu Item 3 is selected", Toast.LENGTH_SHORT).show();
        } else{
            Toast.makeText(getApplicationContext(), "Non listed Menu Item is selected", Toast.LENGTH_SHORT).show();
        }
        //return super.onOptionsItemSelected(item);
        return true;
    }
}