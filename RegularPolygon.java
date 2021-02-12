/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author putth
 */
public class RegularPolygon {

    private int n;
    private double side;
    private double x;
    private double y;

    public RegularPolygon() {
        n = 3;
        side = 1;
        x = 0;
        y = 0;
    }

    public RegularPolygon(int n, double side) {
        this();
        this.side = side;
        this.n = n;

    }

    public RegularPolygon(int n, double side, double x, double y) {
        this(n, side);
        this.x = x;
        this.y = y;
    }

    public int getn() {
        return n;
    }

    public void setn(int n) {
        this.n = n;
    }

    public double getside() {
        return side;
    }

    public void setside(double side) {
        this.side = side;
    }

    public double gety() {
        return y;
    }

    public void sety(double y) {
        this.y = y;
    }

    public double getx() {
        return x;
    }

    public void setx(double x) {
        this.x = x;
    }

    public double getPerimeter(){

        return n * side;
    }

    public double getArea() {

        return (n * side * side) / (4 * Math.tan(Math.PI / n));
    }

}