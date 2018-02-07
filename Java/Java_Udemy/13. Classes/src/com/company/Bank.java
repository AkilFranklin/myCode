package com.company;
// Create a new class for a bank account
// Create fields for the account number, balance, customer name, email and phone number.
//
// Create getters and setters for each field
// Create two additional methods
// 1. To allow the customer to deposit funds (this should increment the balance field).
// 2. To allow the customer to withdraw funds. This should deduct from the balance field,
// but not allow the withdrawal to complete if their are insufficient funds.
// You will want to create various code in the Main class (the one created by IntelliJ) to
// confirm your code is working.
// Add some System.out.println's in the two methods above as well.
public class Bank {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    // creating our own constructo
    public Bank() {
        this("76543", 0.00, "aline","a@a,com", "765456765");
        System.out.println("Aline Bank Constructor created");
    }
    public Bank(String accountNumber, double balance, String customerName,
                String email, String phoneNumber){
        setAccountNumber(accountNumber); // good to use in case there's some validation in the setter method
        setPhoneNumber(phoneNumber);     // can use these since they're public in the class
        this.balance = balance;          // <--- however, this way is better
        this.customerName = customerName;
        this.email = email;
    }

    public Bank(String customerName, String email, String phoneNumber) {
        this("99999", 155.00, customerName, email, phoneNumber);
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
    }

    public void depostFunds(double funds) {
        if (funds >= 0) {
            System.out.println("Balance before deposit: $" + String.format("%2f", this.balance));
            this.balance += funds;
            System.out.println("Balance after deposit: $" + String.format("%2f", this.balance));
        }
        else System.out.println("Cannot deposit negative money");
    }
    public void withdrawFunds(double funds){
        if (funds <= this.balance) {
            System.out.println("Balance before withdrawal: $" + String.format("%2f", this.balance) );
            this.balance -= funds;
            System.out.println("Balance after withdrawal: $" + String.format("%2f", this.balance) );
        }
        else System.out.println("Insufficient funds");
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}