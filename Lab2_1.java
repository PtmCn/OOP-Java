
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
public class Lab2_1 {
    public static void main(String[] args) {
        String day = "";
        String future = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter today's day :");
        int today = input.nextInt();
        System.out.println("Enter the number of days elapsed since today:");
        int elapsed = input.nextInt();
        switch (today){
            case 0: day = "Sunday";break;
            case 1: day = "Monday";break;
            case 2: day = "Tuesday";break;
            case 3: day = "Wednesday";break;
            case 4: day = "Thursday";break;
            case 5: day = "Friday";break;
            case 6: day = "Saturday";break;
        }
        int futureday = today + elapsed;
        futureday %= 7;
        System.out.println(futureday);
        switch (futureday){
            case 0: future = "Sunday";break;
            case 1: future = "Monday";break;
            case 2: future = "Tuesday";break;
            case 3: future = "Wednesday";break;
            case 4: future = "Thursday";break;
            case 5: future = "Friday";break;
            case 6: future = "Saturday";break;
        }
        System.out.println("Today is " + day + " and the future day is " + future);
    }
    
}
