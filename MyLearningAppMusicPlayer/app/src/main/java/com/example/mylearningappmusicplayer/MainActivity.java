package com.example.mylearningappmusicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button startMusicButton;
    Button stopMusicButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startMusicButton=findViewById(R.id.startMusicButton);
        stopMusicButton=findViewById(R.id.stopMusicButton);

        startMusicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Start button Clicked", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(), MyMusicPlayerService.class);
                startService(intent);
            }
        });

        stopMusicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Stop button Clicked", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(), MyMusicPlayerService.class);
                stopService(intent);
            }
        });

    }
}