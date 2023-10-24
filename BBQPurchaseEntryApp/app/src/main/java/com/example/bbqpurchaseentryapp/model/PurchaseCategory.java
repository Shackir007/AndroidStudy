package com.example.bbqpurchaseentryapp.model;

public class PurchaseCategory {
    public PurchaseCategory(String itemCategory, double amount, String person, String description) {
        this.itemCategory = itemCategory;
        this.amount = amount;
        this.person = person;
        this.description = description;
    }

    String itemCategory;
    double amount;
    String person;
    String description;

    public String getItemCategory() {
        return itemCategory;
    }

    public double getAmount() {
        return amount;
    }

    public String getPerson() {
        return person;
    }

    public String getDescription() {
        return description;
    }
}
