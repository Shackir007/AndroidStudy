package com.example.mylearningappsportsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mylearningappsportsapp.model.Sports;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    public MyAdapter(List<Sports> sportsList) {
        this.sportsList = sportsList;
    }

    private List<Sports> sportsList;


    public void setItemClickListener(MyItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    MyItemClickListener itemClickListener;


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View myView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item_layout, parent, false);


        return new MyViewHolder(myView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Sports sports =sportsList.get(position);
        holder.sportsImageView.setImageResource(sports.getImageSport());
        holder.sportsTitle.setText(sports.getTitleSport());
    }

    @Override
    public int getItemCount() {
        return this.sportsList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView sportsImageView;
        TextView sportsTitle;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            this.sportsImageView=itemView.findViewById(R.id.sportsImageView);
            this.sportsTitle=itemView.findViewById(R.id.sportsTitle);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (itemClickListener != null) {
                itemClickListener.onMyItemClickListener(view, getAdapterPosition());
            }
        }
    }
}
