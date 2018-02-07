package com.company;


// composition is creating a class from objects from another class
// here, the PC class is made op of created objects from other classes
public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20, 5);
        Case theCase = new Case("21785", "Apple", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "LG", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("AF-1985", "Intel", 4,6,"v.170285");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();

    }
}
