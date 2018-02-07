package com.company;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2; // two operators here, the equal and plus signs
        System.out.println("1 + 2 = " + result);

        int prevResult = result;

        result = result - 1;
        System.out.println("new result is " + result);

        double modVar = 5d % 3d;
        System.out.println("5 mod 3 is " + modVar);
        modVar++;
        System.out.println("modVar + 1 is " + modVar);
        modVar += 2;
        System.out.println("modVar += 2 is " + modVar);

        boolean isAlien = false;
        if (isAlien == true)
        {
            System.out.println("it is an alien");
        }
        else System.out.println("it is not an alien");

        int score = 50;
        if ((score > 40) && (score < 60)) System.out.println("Score is in between 40 and 60");
        if ((score > 40) || (score < 40)) System.out.println("score is lesser or larger than 40");

        boolean isCar = false;
        boolean wasCar = isCar ? true : false; // if isCar == true, wasCar ==
        if (wasCar)
            System.out.println("was car is true 1");
        isCar = true;
        wasCar = isCar ? true : false; // if isCar == true, wasCar ==
        if (wasCar)
            System.out.println("was car is true 2");

    // Challenge
        // 1. Create a double variable with the value of 20
        // 2. Create a second double variable with value 80
        // 3. Add both numbers and multiply by 25
        // 4. Use the remainder to figure out sum from 3 divided by 40
        // 5. write and if that displays "total is ove the limit"
        //      if the remainder is equal to 20 or less.

        double challengeDouble = 20d;
        double challengeDouble2 = 80d;
        double challengeProduct = (double) 25 * (challengeDouble + challengeDouble2);
        System.out.println("product is " + challengeProduct);
        double challengeRemainder = challengeProduct % 40;
        System.out.println("remainder is " + challengeRemainder);
        if (challengeRemainder <= 20) System.out.println("Total is over the limit!");



    }
}
