package com.example.mylearningappvolumecalc.presenter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.mylearningappvolumecalc.R;
import com.example.mylearningappvolumecalc.model.Shape;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class MyCustomGridAdapter extends ArrayAdapter<Shape> {
    private Context context;
    private ArrayList<Shape> shapeArrayList;

    public MyCustomGridAdapter(@NonNull Context context, ArrayList<Shape> shapeArrayList) {
        super(context, R.layout.grid_item_layout, shapeArrayList);
        this.context=context;
        this.shapeArrayList=shapeArrayList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Shape shape=this.getItem(position);
        MyGridViewHolder myGridViewHolder ;

        if(convertView == null) {
            LayoutInflater inflater=LayoutInflater.from(getContext());
            convertView=inflater.inflate(R.layout.grid_item_layout,parent,false);

            myGridViewHolder=new MyGridViewHolder();
            myGridViewHolder.shapreImageView=(ImageView) convertView.findViewById(R.id.imageView);
            myGridViewHolder.shapreTextView=(TextView) convertView.findViewById(R.id.textView);

            convertView.setTag(myGridViewHolder);
        }else {
            myGridViewHolder= (MyGridViewHolder) convertView.getTag();
        }

        myGridViewHolder.shapreTextView.setText(shape.getText().substring(0,1).toUpperCase() + shape.getText().substring(1).toLowerCase());
        myGridViewHolder.shapreImageView.setImageResource(shape.getImage());

        return convertView;
    }

    private static class MyGridViewHolder{
        ImageView shapreImageView;
        TextView shapreTextView;
    }
}
