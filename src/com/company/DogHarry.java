package com.company;

public class DogHarry {
    private String color;
    private String breed;

    public String getColor() {
        return color;
    }

    public String getBreed() {
        return breed;
    }

    public DogHarry(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }
    public String getInfo() {
        return  "Color: " + getColor();
    }
}
