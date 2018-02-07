package com.company;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String fur;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String fur) {
        super(name, 1, 1, size, weight);
        // super is to call the constructor to call from the class we're extending(inheriting) from
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.fur = fur;
    }
    private void chew(){
        System.out.println("Dog.chew() called");
    }

    @Override // reminder that youre overriding a method from the super class (Animal)
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk() called");
//        move(2);
        super.move(20); //says to use the move from Animal, not the one from here
    }
    public void run(){
        System.out.println("Dog.run() called");
        move(20);
    }
    public void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called");
    }
    @Override
    public void move(int speed) {
        System.out.println("Dog.move(0 called");
        moveLegs(speed);
        super.move(speed);
    }
}
