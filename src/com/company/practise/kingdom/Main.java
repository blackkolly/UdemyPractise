package com.company.practise.kingdom;

public class Main {
    public static void main(String[] args){
        Animal reptile = new Animal("Dog","black","height");
        System.out.println(reptile.color +"" + reptile.name + " is nice with a lovely "+ reptile.height);
        Animal display = new Animal();
        display.displayAnimal();
    }
}