package com.example.mylearningappsportsapp.model;

public class Sports {
    public int getImageSport() {
        return imageSport;
    }

    private int imageSport;
    private String titleSport;

    public Sports(int imageSport, String titleSport) {
        this.imageSport = imageSport;
        this.titleSport = titleSport;
    }

    public String getTitleSport() {
        return titleSport;
    }
}
