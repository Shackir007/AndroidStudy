package com.example.mylearningappgroceryapp.model;

public class Item {
    private int itemImage;
    private String itemName, itemDesc;

    public Item(int itemImage, String itemName, String itemDesc) {
        this.itemImage = itemImage;
        this.itemName = itemName;
        this.itemDesc = itemDesc;
    }
    public int getItemImage() {
        return itemImage;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemDesc() {
        return itemDesc;
    }
}
