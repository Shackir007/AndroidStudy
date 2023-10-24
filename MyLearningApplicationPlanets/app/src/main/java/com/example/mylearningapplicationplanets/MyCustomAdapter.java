package com.example.mylearningapplicationplanets;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.mylearningapplicationplanets.model.Planet;

import java.util.ArrayList;
import java.util.List;

public class MyCustomAdapter extends ArrayAdapter<Planet> {
    private ArrayList<Planet> planetsArrayList;
    private Context context;


    public MyCustomAdapter(@NonNull Context context, ArrayList<Planet> arrayList) {
        super(context, R.layout.itemlistlayout, arrayList);
        this.context=context;
        this.planetsArrayList=arrayList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Planet planet = getItem(position);
        MyViewHolder myViewHolder;
        final View result;

        if (convertView == null) {
            //New View
            myViewHolder= new MyViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.itemlistlayout,parent, false);
            myViewHolder.textViewPlanetName=(TextView) convertView.findViewById(R.id.textViewPlanetName);
            myViewHolder.textViewMoonCount=(TextView) convertView.findViewById(R.id.textViewMoonCount);
            myViewHolder.imageView=(ImageView) convertView.findViewById(R.id.imageViewPlanet);

            result=convertView;
            convertView.setTag(myViewHolder);
        }else{
            //View is recycled-Scrolling screen
            myViewHolder=(MyViewHolder) convertView.getTag();
            result=convertView;
        }

        myViewHolder.textViewPlanetName.setText(planet.getName().toUpperCase());
        myViewHolder.textViewMoonCount.setText(planet.getMoonCount()+" Moon(s)");
        myViewHolder.imageView.setImageResource(planet.getImage());

        return result;
    }

    private static class MyViewHolder{
        TextView textViewPlanetName;
        TextView textViewMoonCount;
        ImageView imageView;
    }
}
