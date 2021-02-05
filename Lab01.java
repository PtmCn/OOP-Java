/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author putth
 */
public class Lab01 {
    public static void main(String[] args) {
        int pop = 312032486;
        int second = 365 * 24 * 60 * 60;
        int birth = second/7;
        int death = second/13;
        int immi = second/45;
        int difference = birth - death + immi;
        int year1 = 312032486;
        int year2 = year1 + difference;
        int year3 = year2 + difference;
        int year4 = year3 + difference;
        int year5 = year4 + difference;
        System.out.println("year1 = " + year1);
        System.out.println("year2 = " + year2);
        System.out.println("year3 = " + year3);
        System.out.println("year4 = " + year4);
        System.out.println("year5 = " + year5);
        
    }
    
}
