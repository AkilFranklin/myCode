package com.company;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    // use 'this' to access the private Class variables
    public void setModel(String model){
        String validModel = model.toLowerCase();
        if (validModel.equals("boxter") || validModel.equals("a6")){
            this.model = model;
        }
        else {
            this.model="Unknown";
        }
    }
    public void setDoors(int doors){
        this.doors = doors;
    }
    public String getModel(){
        return this.model;
    }
    public int getDoors() {
        return this.doors = doors;
    }


}
