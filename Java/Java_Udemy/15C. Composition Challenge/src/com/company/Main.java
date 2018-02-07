package com.company;
// Create a single room of a house using composition.
// Think about the things that should be included in the room.
// Maybe physical parts of the house but furniture as well
// Add at least one method to access an object via a getter and
// then that objects public method as you saw in the previous video
// then add at least one method to hide the object e.g. not using a getter
// but to access the object used in composition within the main class
// like you saw in this video.
public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(15,8, 15);
        Dimensions bedDimensions = new Dimensions(5,3,6);
        Room theRoom = new Room(2,true, dimensions);
        Bed theBed = new Bed(bedDimensions, "Cool ass bed", 2);
        Lamp lamp = new Lamp("Cool as shit lamp");

        Bedroom bedroom = new Bedroom(dimensions, theRoom, theBed, lamp);

        theBed.getDimensions();
        bedroom.getLamp().turnOn();
        bedroom.makeBed();
    }
}
