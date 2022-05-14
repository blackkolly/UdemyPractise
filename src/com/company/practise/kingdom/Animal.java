package com.company.practise.kingdom;

public class Animal {
    String color;
    String name;
    String height;

    public Animal(String color, String name, String height) {
        this.color = color;
        this.name = name;
        this.height = height;
    }
    public void featureAnimal(){
        System.out.println("I love this " + name + " with a beautiful " + color + " and is " + height);
    }
    public Animal(){
        this.color = "red";
        this.height = "meter";

    }
    public void displayAnimal(){
        System.out.println("What is the animal color:"+ color);
    }
}



