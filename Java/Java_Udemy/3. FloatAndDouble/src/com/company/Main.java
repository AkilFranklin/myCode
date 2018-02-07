package com.company;

public class Main {

    public static void main(String[] args) {
        int intNum = 5;
        int intNum2 = 5 / 2;

        // float width of 32 (4 bytes)
        float floatNum = 5f / 3f;
//        float floatNum = 5.4;
//        float floatNum = (float) 5.4;

        // double width of 64 (8 bytes)
        // double is fast and more precise
        double doubleNum = 5d / 2d;
        System.out.printf("my int = %d%n", intNum);
        System.out.println("my int2 = " + intNum2);
        System.out.println("my float = " + floatNum);
        System.out.println("my double = " + doubleNum);

//        Output
//        my int = 5
//        my int2 = 2
//        my float = 1.6666666
//        my double = 2.5



//         1. Create a variable to store the number of pounds
//         2. Calculate the number of Kilograms for the number above and store in a variable.
//         3. Print the result
//         1 lb is equal to .45359237 kilos

        double pounds = 190d;
        double kilosInPounds = .45359237d;
        System.out.println(pounds + " pounds is " + pounds * kilosInPounds + " kilos");

//        Output
//        my int = 5
//        my int2 = 2
//        my float = 1.6666666
//        my double = 2.5
//        190.0 pounds is 86.1825503 kilos
    }
}
