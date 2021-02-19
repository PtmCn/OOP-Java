/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author putth
 */
public class BMI {
    private String name;
    private int age;
    private double weight;
    private double inches;


    public BMI(String name, int age, double weight, double inches){
        this.name = name;
        this.age = age;
        this.weight = weight*0.45359237;
        this.inches = inches*0.0254;
    }
    
    public double getBMI() {
        double bmi = weight  /(inches  * inches );
        return Math.round(bmi * 100) / 100.0;
    }

    public String getStatus() {
        double bmi = getBMI();
        if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 25)
            return "Normal";
        else if (bmi < 30)
            return "Overweight";
        else
            return "Obese";
    }

}
