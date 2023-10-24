package com.example.bbqpurchaseentryapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.bbqpurchaseentryapp.adapter.PurchaseCategoryAdapter;
import com.example.bbqpurchaseentryapp.adapter.PurchasePaymentAdapter;
import com.example.bbqpurchaseentryapp.model.PurchaseCategory;
import com.example.bbqpurchaseentryapp.model.PurchasePayment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerCategoryHeaderView;
    RecyclerView recyclerCategoryListView;
    RecyclerView recyclerPaymentHeaderView;
    RecyclerView recyclerPaymentListView;

    List<PurchaseCategory> purchaseCategoryHeaderList;
    List<PurchaseCategory> purchaseCategoryElementList;
    List<PurchasePayment> purchasePaymentHeaderList;
    List<PurchasePayment> purchasePaymentElementList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerCategoryHeaderView=findViewById(R.id.recyclerCategoryHeaderView);
        recyclerCategoryListView=findViewById(R.id.recyclerCategoryListView);
        recyclerPaymentHeaderView=findViewById(R.id.recyclerPaymentHeaderView);
        recyclerPaymentListView=findViewById(R.id.recyclerPaymentListView);
        loadCategoryHeader();
        loadCategories();
        loadPaymentHeader();
        loadPayments();
    }
    private void loadCategoryHeader() {
        purchaseCategoryHeaderList = new ArrayList<PurchaseCategory>();
        purchaseCategoryHeaderList.add(new PurchaseCategory("Item Category", 0.0, "Person", "Description"));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        PurchaseCategoryAdapter adapter=new PurchaseCategoryAdapter(purchaseCategoryHeaderList);

        recyclerCategoryHeaderView.setLayoutManager(linearLayoutManager);
        recyclerCategoryHeaderView.setAdapter(adapter);
    }

    private void setAdapter(@NonNull RecyclerView recyclerView, List list){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        PurchaseCategoryAdapter adapter=new PurchaseCategoryAdapter(list);

        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void loadCategories() {
        purchaseCategoryElementList=new ArrayList<PurchaseCategory>();
        purchaseCategoryElementList.add(new PurchaseCategory("Charcoal", 231900, " "," "));
        purchaseCategoryElementList.add(new PurchaseCategory("Charcoal", 0, " "," "));
        purchaseCategoryElementList.add(new PurchaseCategory("Loading", 8600, " "," "));
        purchaseCategoryElementList.add(new PurchaseCategory("Packing", 200, " ","Drinks"));
        purchaseCategoryElementList.add(new PurchaseCategory("Packing", 3800, " ","Sack"));
        purchaseCategoryElementList.add(new PurchaseCategory("Misc", 1500, " ","Commission-Karup"));
        purchaseCategoryElementList.add(new PurchaseCategory("Misc", 300, " "," "));
        purchaseCategoryElementList.add(new PurchaseCategory("Permit", 500, " ","Pass"));
        purchaseCategoryElementList.add(new PurchaseCategory("Freight", 0, " ","0"));
        purchaseCategoryElementList.add(new PurchaseCategory("Freight", 28500, " "," "));
        purchaseCategoryElementList.add(new PurchaseCategory("Unloading", 3000, "  "," "));
        purchaseCategoryElementList.add(new PurchaseCategory("Weighing", 250, " "," "));

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        PurchaseCategoryAdapter adapter=new PurchaseCategoryAdapter(purchaseCategoryElementList);

        recyclerCategoryListView.setLayoutManager(linearLayoutManager);
        recyclerCategoryListView.setAdapter(adapter);
    }


    private void loadPaymentHeader() {
        purchasePaymentHeaderList=new ArrayList<PurchasePayment>();
        purchasePaymentHeaderList.add(new PurchasePayment("Person",0.0, "Description"));

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        PurchasePaymentAdapter adapter=new PurchasePaymentAdapter(purchasePaymentHeaderList);

        recyclerPaymentHeaderView.setLayoutManager(linearLayoutManager);
        //recyclerPaymentHeaderView.setAdapter(adapter);
    }

    void loadPayments(){
        purchasePaymentElementList=new ArrayList<PurchasePayment>();
        purchasePaymentElementList.add(new PurchasePayment("Hamza", 66700, "Charcoal"));
        purchasePaymentElementList.add(new PurchasePayment("Shackir", 50000, "Charcoal"));
        purchasePaymentElementList.add(new PurchasePayment("Hamza", 53000, "Charcoal"));
        purchasePaymentElementList.add(new PurchasePayment("Riyas", 12200, "Charcoal"));
        purchasePaymentElementList.add(new PurchasePayment("Hamza", 3800, "Sack"));
        purchasePaymentElementList.add(new PurchasePayment("Riyas", 200, "Packing-Tea"));
        purchasePaymentElementList.add(new PurchasePayment("Riyas", 8600, "Loading"));
        purchasePaymentElementList.add(new PurchasePayment("Riyas", 300, "Karupp Bike"));
        purchasePaymentElementList.add(new PurchasePayment("Hamza", 1500, "Karupp Commission"));
        purchasePaymentElementList.add(new PurchasePayment("Riyas", 0, "Karupp Tea"));
        purchasePaymentElementList.add(new PurchasePayment("Riyas", 250, "Weighing Machine"));
        purchasePaymentElementList.add(new PurchasePayment("Riyas", 500, "Permit"));
        purchasePaymentElementList.add(new PurchasePayment("Hamza", 3000, "Unloading"));
        purchasePaymentElementList.add(new PurchasePayment("Hamza", 0, "Unloading-Auto charge"));
        purchasePaymentElementList.add(new PurchasePayment("Hamza", 0, "Unloading-Water"));
        purchasePaymentElementList.add(new PurchasePayment("Riyas", 0, "Freight - Root2nd"));
        purchasePaymentElementList.add(new PurchasePayment("Riyas", 10000, "Freight - Advance"));
        purchasePaymentElementList.add(new PurchasePayment("Riyas", 18500, "Freight"));
        purchasePaymentElementList.add(new PurchasePayment("Hamza", 0, "Freight"));

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        PurchasePaymentAdapter adapter=new PurchasePaymentAdapter(purchasePaymentElementList);

        //recyclerPaymentListView.setLayoutManager(linearLayoutManager);
        //recyclerPaymentListView.setAdapter(adapter);
    }
}