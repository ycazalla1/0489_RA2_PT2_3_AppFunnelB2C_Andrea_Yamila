package com.example.a0489_ra2_pt2_3_appfunnelb2c_andrea_yamila;

import android.media.Image;

public class Item {
    private String title;
    private Image image;

    // Constructor
    public Item(String title, Image imageUrl) {
        this.title = title;
        this.image = image;
    }

    // Getters
    public String getTitle() {
        return title;
    }
    public String getImage() {
        return image;
    }
}
