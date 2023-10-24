package com.example.bbqpurchaseentryapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bbqpurchaseentryapp.R;
import com.example.bbqpurchaseentryapp.model.PurchasePayment;

import java.util.List;

public class PurchasePaymentAdapter extends RecyclerView.Adapter<PurchasePaymentAdapter.PurchasePaymentsViewHolder> {
    List<PurchasePayment> purchasePayments;

    public PurchasePaymentAdapter(List<PurchasePayment> purchasePayments) {
        this.purchasePayments = purchasePayments;
    }


    @NonNull
    @Override
    public PurchasePaymentsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.purchase_payments_layout, parent, false);

        return new PurchasePaymentsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PurchasePaymentsViewHolder holder, int position) {
        PurchasePayment purchasePayment=this.purchasePayments.get(position);

        holder.paymentPersonTextView.setText(purchasePayment.getName());
        holder.paymentAmountTextView.setText(" "+purchasePayment.getAmount());
        holder.paymentDescriptiontextView.setText(purchasePayment.getDiscription());
    }

    @Override
    public int getItemCount() {
        return purchasePayments.size();
    }

    class PurchasePaymentsViewHolder extends RecyclerView.ViewHolder{

        TextView paymentPersonTextView;
        TextView paymentAmountTextView;
        TextView paymentDescriptiontextView;

        public PurchasePaymentsViewHolder(@NonNull View itemView) {
            super(itemView);
/*
            this.paymentPersonTextView = itemView.findViewById(R.id.paymentPersonTextView);
            this.paymentAmountTextView = itemView.findViewById(R.id.paymentAmountTextView);
            this.paymentDescriptiontextView = itemView.findViewById(R.id.paymentDescriptiontextView);*/
        }

    }
}
