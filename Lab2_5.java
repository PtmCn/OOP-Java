
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
public class Lab2_5 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of lines:");
        int line = input.nextInt();
        int num = line;
        for (int i = 1; i <= line ; i++)
        {
            for (int j = 1; j <= (line-i)*2; j++)
            {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--)          
            {
                System.out.print(" " + k); 
            }
            for (int l = 2; l <= i; l++)
            {               
                System.out.print(" " + l);

            }
            System.out.println();
        }
    }
}