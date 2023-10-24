package com.example.mylearningappgroceryapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mylearningappgroceryapp.model.Item;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    MyAdapter(List<Item> itemList){
        this.itemList=itemList;
    }

    private List<Item> itemList;

    public MyClickListener myItemClickListener;

    public void setItemClickListener(MyClickListener myItemClickListener) {
        this.myItemClickListener = myItemClickListener;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Item item = itemList.get(position);
        holder.itemImage.setImageResource(item.getItemImage());
        holder.itemTitle.setText(item.getItemName());
        holder.itemDescription.setText(item.getItemDesc());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView itemImage;
        TextView itemTitle;
        TextView itemDescription;

        public MyViewHolder(@NonNull View itemView){
            super(itemView);

            itemImage=itemView.findViewById(R.id.itemImageView);
            itemTitle=itemView.findViewById(R.id.itemTitle);
            itemDescription=itemView.findViewById(R.id.itemDescription);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            //make class non static to access public class variables
            if (myItemClickListener != null){
                myItemClickListener.onMyClick(view, getAdapterPosition());
            }
        }
    }
}