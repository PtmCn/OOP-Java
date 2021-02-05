
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
public class Lab2_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year: (e.g., 2012):");
        int year = input.nextInt();
        System.out.println("Enter month: 1-12:");
        int month = input.nextInt();
        
        if(month == 1){
            year -=1;
            month = 13;
        }
        else if (month == 2){
            year -=1;
            month = 14;
        }
        
        System.out.println("Enter the day of the month:1-31:");
        int day = input.nextInt();
        int k = year % 100;
        int j = year / 100;
        String dayout = "";

        int dayofweek = ((day + ((26*(month+1))/10) + k + (k/4) + (j/4) + (5*j))%7);
        switch (dayofweek){
            case 0: dayout = "Saturday";break;
            case 1: dayout = "Sunday";break;
            case 2: dayout = "Monday";break;
            case 3: dayout = "Tuesday";break;
            case 4: dayout = "Wednesday";break;
            case 5: dayout = "Thursday";break;
            case 6: dayout = "Friday";break;
        }
        System.out.println("Day of the week is "+ dayout);
    }
    
}
