package com.company;

public class Main {

    public static void main(String[] args) {
//        // int has a width of 32
//        int minInt = -2_147_483_648;
//        int maxInt = 2_147_483_647;
//        int tooMuch = (maxInt/2);
//        System.out.println("total is " + tooMuch);
//
//        // byte has a width of 8
//        byte minByte = -128;
//        byte maxByte = 127;
////        byte newByte = minByte/2; // expression makes Java convert to integer
//        byte newByte = (byte) (minByte/2); // expression makes Java convert to integer
//
//        // short has a width of 16
//        short minShort = 32767;
//        short maxShort = -32768;
//
//        // long needs the L at the end. width of 64
//        long maxLong = 9_223_372_036_854_775_807L;
//        long minLong = -9_223_372_036_854_775_808L;

        // 1. Create a valid byte variable
        // 2. Create a valid short varaible
        // 3. Create a valid int variable
        // 3. Create a variable of type long and make
        //    it equal to 50,000 + 10 tiems the sum of
        //    byte, short, and int.

        byte byteVar = 28;
        short shortVar = 21700;
        int intVar = 12345678;

        short shortTotal = (short) (1000 + 10 * (byteVar + shortVar + intVar));
        long longVar = 50000L + 10L * (byteVar + shortVar + intVar);
        System.out.println("long var = " + longVar);
        System.out.println("short var = " + shortTotal);
    }
}
