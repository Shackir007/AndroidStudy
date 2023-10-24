package com.example.bbqpurchaseentryapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bbqpurchaseentryapp.R;
import com.example.bbqpurchaseentryapp.model.PurchaseCategory;

import java.util.List;

public class PurchaseCategoryAdapter extends RecyclerView.Adapter<PurchaseCategoryAdapter.PurchaseCategoryViewHolder> {
    public PurchaseCategoryAdapter(List<PurchaseCategory> purchaseCategoryList) {
        this.purchaseCategoryList = purchaseCategoryList;
    }

    List<PurchaseCategory> purchaseCategoryList;


    @NonNull
    @Override
    public PurchaseCategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PurchaseCategoryViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.purchase_item_category, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PurchaseCategoryViewHolder holder, int position) {
        PurchaseCategory purchaseCategory=this.purchaseCategoryList.get(position);

        holder.itemCategoryView.setText(purchaseCategory.getItemCategory());
        holder.itemAmountView.setText(" "+purchaseCategory.getAmount());
        holder.personCategoryView.setText(purchaseCategory.getPerson());
        holder.descriptionView.setText(purchaseCategory.getDescription());
    }

    @Override
    public int getItemCount() {
        return purchaseCategoryList.size();
    }

    class PurchaseCategoryViewHolder extends RecyclerView.ViewHolder{

        TextView itemCategoryView;
        TextView itemAmountView;
        TextView personCategoryView;
        TextView descriptionView;

        public PurchaseCategoryViewHolder(@NonNull View itemView) {
            super(itemView);

            this.itemCategoryView= itemView.findViewById(R.id.itemCategoryView);
            this.itemAmountView= itemView.findViewById(R.id.itemAmountView);
            this.personCategoryView= itemView.findViewById(R.id.personCategoryView);
            this.descriptionView= itemView.findViewById(R.id.descriptionView);
        }
    }
}
