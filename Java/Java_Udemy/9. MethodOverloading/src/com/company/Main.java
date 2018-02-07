package com.company;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Akil", 500);
        System.out.println("New score is " + newScore);

        newScore = calculateScore(750);
        System.out.println("New score is " + newScore);

        calculateScore();

        System.out.println(calcFeetAndInchesToCentimeters(-100));
        System.out.println(calcFeetAndInchesToCentimeters(6, 0));

        calcFeetAndInchesToCentimeters(100);

    }
    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score +  " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed player scored " + score +  " points");
        return score * 1000;
    }
    public static int calculateScore(){
        System.out.println("No player, no score!");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches){
        if (feet <0 || inches <0 || inches >12) return -1;
        return (feet * 12 * 2.54) + (inches * 2.54);
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches <0) return -1;
        int feet = (int) inches / 12;
        int remainingInches = (int) inches % 12;
        System.out.println(inches + " is equal to " + feet + "'" + remainingInches + "\"");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
//Challenge
//Create a method called calcFeetAndInchesToCentimeters
//input: int: feet, int: inches
//error checking: feet >= 0, inches >=0 and <=12
//    return -1 if both are not true
//return: double: centimeters
//
//Create a method same name one parameter
//input: inches
//error checking: inches >=0
//    return -1 if not true
//return: int feet



}
