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
public class Stock {

    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }
    String getSymbol() {
        return symbol;
    }
    void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    String getName() {
        return name;
    }
    void setName(String name) {
        this.name = name;
    }
    double getCurrentPrice() {
        return currentPrice;
    }
    void setCurrentPrice(double currentPrice) {
        this.previousClosingPrice = this.currentPrice;
        this.currentPrice = currentPrice;
    }
    double getPreviousClosingPrice() {
        return previousClosingPrice;
    }
    void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }
    double getChangePercent() {
        return (currentPrice - previousClosingPrice)*100 / previousClosingPrice;
    }
}