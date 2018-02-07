package com.company;

public class Main {

    public static void main(String[] args) {
//	// write your code here
        //challenge
        // Create a new class VipCustomer
        // it should have 3 fields name, credit limit, and email address.
        // create 3 constructors
        // 1st constructor empty should call the constructor with 3 parameters with default values
        // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
        // 3rd constructor should save all fields.
        // create getters only for this using code generation of intellij as setters wont be needed
        // test and confirm it works.

        VIPCustomer akil = new VIPCustomer("akil", 100000d, "ffefe@ffe.com");
        System.out.println(akil.getName());
        System.out.println(akil.getEmail());
        System.out.println(akil.getCreditLimit());

        VIPCustomer blank = new VIPCustomer();
        System.out.println(blank.getName());
        System.out.println(blank.getEmail());
        System.out.println(blank.getCreditLimit());


////        using the Consturctor and presetting values
//        Bank myAcct = new Bank("12345", 217.85, "akil", "b@b.com", "2345676543");
////        myAcct.setAccountNumber("123456");
////        myAcct.setBalance(217.85);
////        myAcct.setCustomerName("Akil");
////        myAcct.setEmail("blah@blah.com");
////        myAcct.setPhoneNumber("765432345");
//        Bank defaultAccount = new Bank();
//        System.out.println(defaultAccount.getAccountNumber());
////        System.out.println(defaultAccount.getBalance());
//        System.out.println(defaultAccount.getCustomerName());
//
//
//        System.out.println(myAcct.getAccountNumber());
////        System.out.println(myAcct.getBalance());
//        System.out.println(myAcct.getCustomerName());
////        System.out.println(myAcct.getEmail());
////        System.out.println(myAcct.getPhoneNumber());
//
//        myAcct.withdrawFunds(1700.85);
//        myAcct.depostFunds(150.00);
//
//        Bank dudeAccount = new Bank("Dude", "fef@fef.com", "543456543");
//        System.out.println(dudeAccount.getAccountNumber());
//
//
//        Car porsche = new Car();
//        Car audi = new Car();
//        Car other = new Car();
//
//        porsche.setModel("BOXTER");
//        porsche.setDoors(2);
//        audi.setModel("A6");
//        audi.setDoors(4);
//        other.setModel("HOOPTY");
//
//        System.out.println(porsche.getModel());
//        System.out.println(porsche.getDoors());
//        System.out.println(audi.getModel());
//        System.out.println(audi.getDoors());
//        System.out.println(other.getModel());



    }
}
