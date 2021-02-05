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
public class Lab3_3{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the matrix: ");
        int size = input.nextInt();
        if(size < 1){
            System.out.println("Error");
            return;
        }
        int[][] matrix = new int[size][size];

        for (int i = 0; i<matrix.length ; i++) {
            for (int j = 0; j<matrix[i].length ; j++) {
                matrix[i][j] = (int)(Math.random() * 2);
            }
        }
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j<matrix[i].length ; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }

        int column = 0;
        int row = 0;
        for (int j = 0; j<2 ; j++) {
            for (int i = 0; i<matrix.length ; i++) {
                if (rowSequence(matrix,j,i)) {
                    System.out.println("All " + j + "s on row " + i);
                    row++;
                }
            }

        }
        for (int j = 0; j<2 ; j++) {
            for (int i = 0; i<matrix.length ; i++) {
                if (columnSequence(matrix,j,i)) {
                    System.out.println("All " + j + "s on column " + i);
                    column++;
                }
            }

        }
        if (column == 0) {
            System.out.println("No same numbers on a column");
        }
        if (row == 0) {
            System.out.println("No same numbers on a row");
        }
        if(majorDiagonal(matrix, 1)== true)System.out.println("All 1s on diagonal");
        else if(majorDiagonal(matrix, 0)== true)System.out.println("All 0s on diagonal");
        else System.out.println("No same number on a diagonal");
        
        if(subDiagonal(matrix, 1)== true)System.out.println("All 1s on subdiagonal");
        else if(subDiagonal(matrix, 0)== true)System.out.println("All 0s on subdiagonal");
        else System.out.println("No same number on a subdiagonal");
        
        if(superDiagonal(matrix, 1)== true)System.out.println("All 1s on superdiagonal");
        else if(superDiagonal(matrix, 0)== true)System.out.println("All 0s on superdiagonal");
        else System.out.println("No same number on a superdiagonal");

    }

    public static boolean rowSequence(int[][] m, int n, int row) {
        for (int k = 0; k < m[row].length; k++) {
            if (m[row][k] != n) return false;
        }
        return true;
    }

    public static boolean columnSequence(int[][] m, int n, int column) {
        for (int i = 0; i < m.length; i++) {
            if (m[i][column] != n) return false;
        }
        return true;
    }
    public static boolean majorDiagonal(int[][] m, int n) {
        for (int i = 0; i < m.length; i++) {
            if (m[i][i] != n) return false;
        }
        return true;
    }
    public static boolean subDiagonal(int[][] m, int n) {
        for (int i = 1; i < m.length; i++) {
            if (n != m[i][i-1]) 
                return false;
        }
        return true;
    }

    public static boolean superDiagonal(int[][] m, int n) {
        for (int i = 0; i < m.length - 1; i++) {
            if (n != m[i][i+1]) 
                return false;
        }
        return true;
    }
}