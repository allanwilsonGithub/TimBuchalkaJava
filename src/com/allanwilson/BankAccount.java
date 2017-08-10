package com.allanwilson;

/**
 * Allan's Bank Account Excercise
 */
public class BankAccount {
    private int accountNumber;
    private int balance;
    private String customerName;
    private String emailAddress;
    private String phoneNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public String getCustomerName () {
        return customerName;
    }

    public String getEmailAddress () {
        return emailAddress;
    }

    public String getPhoneNumber () {
        return phoneNumber;
    }

    public void setAccountNumber (int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance (int balance) {
        this.balance = balance;
    }

    public void setCustomerName (String customerName) {
        this.customerName = customerName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmailAddress (String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void depositFunds (int deposit) {
        System.out.println("================================");
        System.out.println("Current Balance: " + balance);
        System.out.println("Depositing: " + deposit);
        balance += deposit;
        System.out.println("New Balance: " + balance);
    }

    public void withdrawFunds (int withdrawal) {
        System.out.println("===============================");
        System.out.println("Current Balance: " + balance);
        System.out.println("Withdrawing: " + withdrawal);
        if (balance-withdrawal >= 0) {
            balance -= withdrawal;
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("Not enough funds!");
        }
    }


}
