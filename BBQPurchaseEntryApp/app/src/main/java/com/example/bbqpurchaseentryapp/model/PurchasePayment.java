package com.example.bbqpurchaseentryapp.model;

public class PurchasePayment {
    String name;
    double amount;
    String discription;

    public PurchasePayment(String name, double amount, String discription) {
        this.name = name;
        this.amount = amount;
        this.discription = discription;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    public String getDiscription() {
        return discription;
    }
}
