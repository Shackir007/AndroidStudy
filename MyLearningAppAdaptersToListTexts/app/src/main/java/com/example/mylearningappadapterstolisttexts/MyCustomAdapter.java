package com.example.mylearningappadapterstolisttexts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.zip.Inflater;

public class MyCustomAdapter extends BaseAdapter {
    private Context context;
    private String[] items;

    MyCustomAdapter(Context context,String[] items){
        this.context=context;
        this.items = items;
    }



    @Override
    public int getCount() {
        return this.items.length;
    }

    @Override
    public Object getItem(int position) {
        return this.items[position];
    }

    @Override
    public long getItemId(int position) {
        return position;//Need unique id for each element and hence returning position
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null){
            convertView= LayoutInflater.from(context).inflate(R.layout.mylistitem, parent, false);
            holder=new ViewHolder();
            holder.textView=convertView.findViewById(R.id.textView1);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.textView.setText(items[position]);

        return convertView;
    }

    static class ViewHolder{
        //Hold references to views in an item layout
        TextView textView;


    }
}

