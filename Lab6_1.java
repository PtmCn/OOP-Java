package lab6;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author putth
 */
public class Lab6_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Input data below...\n");
        
        System.out.println("Name: ");
        String nameIn = input.nextLine();
        
        System.out.println("Age: ");
        int ageIn = input.nextInt();
        
        System.out.println("Weight in pounds");
        double weightIn = input.nextDouble();
        
        System.out.println("Height in inches");
        double inchesIn = input.nextDouble();
        
        BMI p = new BMI(nameIn,ageIn,weightIn,inchesIn);
        
        System.out.println("======================");
        System.out.printf("BMI : %.2f\nStatus : %s\n",p.getBMI(),p.getStatus());
    }
}