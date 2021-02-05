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
public class Lab4_1 {
    public static void main(String[] args) {

        Stock stock1 = new Stock("ORCL", "Oracle Corporation");
        stock1.setCurrentPrice(100);
        stock1.setCurrentPrice(101);
        System.out.println("Symbol: " + stock1.getSymbol());
        System.out.println("Name: " + stock1.getName());
        System.out.println("Previous Closing Price: " + stock1.getPreviousClosingPrice());
        System.out.println("current price: " + stock1.getCurrentPrice());
        System.out.println("Percent changed: " + stock1.getChangePercent());
    }
}
