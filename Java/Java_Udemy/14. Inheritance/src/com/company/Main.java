package com.company;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("animal", 1,1,5,5);

        Dog burger = new Dog("yorkie", 8, 20, 2, 4, 1, 20, "thick");

        burger.eat(); //eat comes from Animal
//        burger.walk();
        burger.run();
    }
}
