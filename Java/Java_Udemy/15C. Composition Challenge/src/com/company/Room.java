package com.company;

public class Room {
    private int windows;
    private boolean door;
    private Dimensions dimensions;

    public Room(int windows, boolean door, Dimensions dimensions) {
        this.windows = windows;
        this.door = door;
        this.dimensions = dimensions;
    }

    public Dimensions getDimensions(){
        return dimensions;
    }

    public int getWindows() {
        return windows;
    }

    public boolean isDoor() {
        return door;
    }
}
