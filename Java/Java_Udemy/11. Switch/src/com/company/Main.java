package com.company;

public class Main {

    public static void main(String[] args) {
//        int value = 1;
//        if (value==1) System.out.println("Value was 1");
//        else if (value == 2) System.out.println("Value was 2");
//        else System.out.println("Was not 1 or 2");

        int switchValue = 4;

        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break; // need breaks. if not here it'll execute following code
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was a 3, 4, or 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        char charValue = 'B';
        switch (charValue){
            case 'A':
                System.out.println("Found the message " + charValue);
                break;
            case 'B':
                System.out.println("Found the message " + charValue);
                break;
            case 'C': case 'D': case 'E':
                System.out.println("Found the message " + charValue);
                break;
            default:
                System.out.println("Message not found");
        }
        String stringValue = "JANUARY";
        switch (stringValue.toLowerCase()) {
            case "january":
                System.out.println("Found the message " + stringValue);
                break;
            case "february":
                System.out.println("Found the message " + stringValue);
                break;
            default:
                System.out.println("whatever");
                break;
        }
    }
}
// Create a new switch statement using char instead of int
// create a new char variable
// create a switch statement testing for
// A, B, C, D, or E
// display a message if any of these are found and then break
// Add a default which displays a message saying not found