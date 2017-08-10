package com.allanwilson;

public class Main {

    public static void main(String[] args) {
	    Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("Carrera");

        System.out.println(porsche.getModel());

        BankAccount allansAccount = new BankAccount();
        allansAccount.depositFunds(100);
        allansAccount.withdrawFunds(40);
    }

}
