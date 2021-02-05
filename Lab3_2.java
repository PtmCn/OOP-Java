/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author putth
 */
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class Lab3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter list1:");
        String text1 = input.nextLine();
        System.out.println("Enter list2:");
        String text2 = input.nextLine();
        String result = text1 + " " + text2;
        //System.out.println(result);
        int[] list3 = stringArrayToIntArray(result);
        
        Arrays.sort(list3);
        
        System.out.print("The merged list is ");
        for (int i = 0; i < list3.length; i++) {
        System.out.print(list3[i] + " ");
        }
        
    }
    public static int[] stringArrayToIntArray(String intString) {
    String[] intStringSplit = intString.split(" "); //Split by spaces
    int[] result = new int[intStringSplit.length]; //Used to store our ints

    for (int i = 0; i < intStringSplit.length; i++) {
        //parse and store each value into int[] to be returned
        result[i] = Integer.parseInt(intStringSplit[i]); 
    }
    return result;
}
}
