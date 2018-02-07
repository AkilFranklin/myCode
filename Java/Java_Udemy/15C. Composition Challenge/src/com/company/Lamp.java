package com.company;

public class Lamp {
    private String style;

    public Lamp(String style) {
        this.style = style;
    }

    public String getStyle() {
        return style;
    }

    public void turnOn(){
        System.out.println("Lamp.java Class Turning lamp on");
    }
}
