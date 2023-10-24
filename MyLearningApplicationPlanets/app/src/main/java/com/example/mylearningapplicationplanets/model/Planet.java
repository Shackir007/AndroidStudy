package com.example.mylearningapplicationplanets.model;

public class Planet {
    //Attributes or Properties

    private String name;
    private int image;
    private int moonCount;

    public Planet(String name,int moonCount,int image){
        this.name=name;
        this.moonCount=moonCount;
        this.image=image;
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getMoonCount() {
        return moonCount;
    }

    public void setMoonCount(int moonCount) {
        this.moonCount = moonCount;
    }
}
