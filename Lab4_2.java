/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author putth
 */
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
public class Lab4_2 {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();

        calendar.getTime();
        
        System.out.println("Current year, month, date, and day of week");
        System.out.printf("Year: %d\n", calendar.get(Calendar.YEAR));
        System.out.printf("Month: %d\n", calendar.get(Calendar.MONTH));
        System.out.printf("Date: %d\n", calendar.get(Calendar.DATE));
        System.out.printf("Day of week is: %d\n", calendar.get(Calendar.DAY_OF_WEEK));
        
        System.out.println("------------");
        
        calendar.add(Calendar.DATE,1);
        
        System.out.println("After specified the elapsed time of one day after current day");
        System.out.printf("Year: %d\n", calendar.get(Calendar.YEAR));
        System.out.printf("Month: %d\n", calendar.get(Calendar.MONTH));
        System.out.printf("Date: %d\n", calendar.get(Calendar.DATE));
        System.out.printf("Day of week is: %d\n", calendar.get(Calendar.DAY_OF_WEEK));
        
        System.out.println(new Date().toString());
    }
}
