package com.company;

public class Main {

    public static void main(String[] args) {
        //this was the challenge. made the loop while he was talking
//        for (int x = 2; x <= 8; x++) {
//            System.out.println("10,000 at " + x + "% interest is " + String.format("%.2f", calculateInterest(10000.0d, (double) x)));
//        }
//        System.out.println("-------------------------");
//
//        //2nd challenge, do it backwards
//        for (int x = 8; x >= 2; x--) {
//            System.out.println("10,000 at " + x + "% interest is " + String.format("%.2f", calculateInterest(10000.0d, (double) x)));
//        }
        int count = 0;
        for (int isPrime = 217; isPrime <= 929; isPrime++){
            if (isPrime(isPrime)) {
                System.out.println(isPrime + " is a prime number");
                count++;
            }
            if (anotherIsPrime(isPrime)) {
                System.out.println(isPrime + " is a prime number");
                count++;
            }
            if (count == 10) break;
        }
    }
    public static boolean isPrime(int n){
        if (n == 1) return false;

        for (int i = 2; i <= n/2; i++){
            if (n % i == 0) {return false;};
        }
        return true;
    }

    public static boolean anotherIsPrime(int n){
        if (n == 1) return false;

        for (int i = 2; i <= (long) Math.sqrt(n); i++){
            if (n % i == 0) {return false;};
        }
        return true;
    }



    public static double calculateInterest(double amount, double interestRate){
        return(amount * (interestRate/100));

    }
}
