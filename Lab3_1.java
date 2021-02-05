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
public class Lab3_1 {
   public static void main(String[] args) {

        int count = 0;
        for (int i = 0; count < 100; i++) {

            if (isPrime(i) && isPalindrome(i)) {
                System.out.printf("%d ", i);
                count++;
                if (count % 10 == 0 && i != 0) System.out.println();
            }
        }
    }
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static int reverse(int n) {
        int reverse = 0;
        while (n != 0) {
            reverse *= 10;
            reverse += n % 10;
            n /= 10;
        }
        return reverse;
    }
    public static boolean isPalindrome(int n) {

        return (n == reverse(n));
    }
}