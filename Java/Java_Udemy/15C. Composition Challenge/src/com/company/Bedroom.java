package com.company;

public class Bedroom {
    private Dimensions dimensions;
    private Room room;
    private Bed bed;
    private Lamp lamp;

    public Bedroom(Dimensions dimensions, Room room, Bed bed, Lamp lamp) {
        this.dimensions = dimensions;
        this.room = room;
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public void makeBed() {
        System.out.println("Making the bed in the bedroom Bedroom.java Class");
        System.out.println("This bed is " + getBedHeight() + " feet tall");
        bed.make();
    }
    private int getBedHeight(){
        return bed.getHeight();
    }
}
