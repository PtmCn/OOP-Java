/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.Scanner;

/**
 *
 * @author putth
 */
public class Lab5_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account account = new Account(1122, 20000);
        account.setAnnualInterestRate(4.5);

        System.out.println("Account ID: " + account.getid());
        System.out.println("Account Balance: " + account.getbalance());
        System.out.println("Annual Interest Rate: " + account.getAnnualInterestRate());
        System.out.println("");

        System.out.println("Enter withdraw amount:");
        //input via keyboard
        int withd = input.nextInt();
        account.withdraw(withd);

        System.out.println("Enter deposit amount:");
        //input via keyboard
        int depos = input.nextInt();
        account.deposit(depos);

        System.out.println("Account ID: " + account.getid());
        System.out.println("Account Balance: " + account.getbalance());
        System.out.println("Monthly interest: " + account.getMonthlyInterestRate());
        System.out.println("Date account was created: " + account.getDateCreated());


    }
}