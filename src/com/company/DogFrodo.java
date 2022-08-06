package com.company;

public class DogFrodo extends DogDobi {
    private String shelter;

    public String getShelter() {
        return shelter;
    }

    public DogFrodo(String color, String breed, String name, String commands, String shelter) {
        super(color, breed, name, commands);
        this.shelter = shelter;
    }
    public void makeVoice() {
        System.out.println("Ýòî Skyline");
    }
    public String getInfo() {
        return super.getInfo() +
                "\nBreed: " + getBreed() +
                "\nColor: " + getColor();
    }
}


