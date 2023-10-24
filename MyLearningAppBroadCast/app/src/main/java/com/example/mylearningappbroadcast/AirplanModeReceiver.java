package com.example.mylearningappbroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class AirplanModeReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent != null && intent.getAction() == Intent.ACTION_AIRPLANE_MODE_CHANGED){
            Toast.makeText(context, "Airoplan Mode is changed", Toast.LENGTH_SHORT).show();
            boolean isAiroplanModeOn = intent.getBooleanExtra("state", false);

            Toast.makeText(context, "Airoplan Mode is "+(isAiroplanModeOn?"On":"Off"), Toast.LENGTH_SHORT).show();
        }
    }
}
