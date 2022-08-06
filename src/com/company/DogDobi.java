package com.company;

public class DogDobi extends DogHarry{
    private String name;
    private String commands;

    public String getName() {
        return name;
    }

    public String getCommands() {
        return commands;
    }

    public DogDobi(String color, String breed, String name, String commands) {
        super(color, breed);
        this.name = name;
        this.commands = commands;
    }
    public void makeVoice(){
        System.out.println("Ýòî Íèññàí");
    }

    public final void makeVoice (String voice) {
        System.out.println(voice);
    }
}
