package com.company;

public class Main {

    public static void main(String[] args) {
	    // width of 16, or 2 bytes
        char charVar = 'A';
        charVar = '\u2622';
        System.out.println(charVar);

        boolean boolVar = true;
        boolVar = false;
        System.out.println(boolVar);


        // 1. Find the code for the registered symbol on the same line as the copyright symbol.
        // 2. Create a variable of type char and assign it the unicode value for that symbol
        // 3. print

        char registeredSymbol = '\u00AE';
        System.out.println(registeredSymbol);
    }


}
