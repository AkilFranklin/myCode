package com.company;

public class Bed {
    private Dimensions dimensions;
    private String typeOfBed;
    private int pillows;

    public Bed(Dimensions dimensions, String typeOfBed, int pillows) {
        this.dimensions = dimensions;
        this.typeOfBed = typeOfBed;
        this.pillows = pillows;
    }

    public void make(){
        System.out.println("Making the bed (Bed.java class)");
    }

    public void getDimensions() {
        dimensions.getDimensions();
    }

    public int getHeight(){
        return dimensions.getHeight();
    }

    public String getTypeOfBed() {
        return typeOfBed;
    }
}
