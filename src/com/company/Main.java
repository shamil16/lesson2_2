package com.company;

public class Main {

    public static void main(String[] args) {
        DogDobi object = new DogDobi("Grey","GermanShepherd","Dobi","сидеть,лежать,нападать,защищать");
        DogFrodo object2 = new DogFrodo("Black","Taksa","Frodo","кусать","fire");
        DogFrodo object3 = new DogFrodo("Grey","Buldog","Bakins","апорт","ryf");
        object.makeVoice();
        object2.makeVoice();
        object3.makeVoice();
        System.out.println(object.getInfo());
    }
}
