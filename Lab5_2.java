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
public class Lab5_2 {

    public static void main(String[] args) {

        RegularPolygon[] regularPolygons = new RegularPolygon[3];
        regularPolygons[0] = new RegularPolygon();
        regularPolygons[1] = new RegularPolygon(4,2);
        regularPolygons[2] = new RegularPolygon(4,2,5.6,8.7);

        for (int i = 0; i < 3; i++) {

            System.out.printf("Polygon %d area = %.3f perimeter = %.3f\n",
                    i, regularPolygons[i].getArea(), regularPolygons[i].getPerimeter());
        }
    }
}