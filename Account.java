/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author putth
 */
//import java.util.ArrayList;
import java.util.Date;

public class Account {

    private int id;
    private double balance;
    private double AnnualInterestRate;
    private Date DateCreated;


    public Account() {
        DateCreated = new Date();
    }

    public Account(int id, double balance) {
        this();
        this.id = id;
        this.balance = balance;
    }
    
    public int getid() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getbalance() {
        return balance;
    }

    public void setbalance(double nbalance) {
        balance = nbalance;
    }

    public double getAnnualInterestRate() {
        return AnnualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        AnnualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return DateCreated;
    }

    public double getMonthlyInterestRate() {
        return balance * (AnnualInterestRate / 12) / 100;
    }

    public void withdraw(double amount) {
        if(this.balance >=  amount && amount >=0){
            System.out.println("Withdrawing " + amount);
            balance -= amount;
            System.out.println("Account Balance: " + balance  +"\n");
        }
        else{
            System.out.println("Error\n");
        }
    }

    public void deposit(double amount) {
        if(amount >=0){
            System.out.println("Depositing "+ amount);
            balance += amount;
            System.out.println("Account Balance: " + balance + "\n");
        }
        else{
            System.out.println("Error\n");
        }
    }
}

