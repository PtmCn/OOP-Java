import java.util.Scanner;
public class Lab04 {
    public static void main(String[] args) {
        double weight = 0;
        double height = 0;
        double BMI = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight in pounds:");
         weight = input.nextDouble();
        System.out.println("Enter height in inches:");
         height = input.nextDouble();
        weight /= 2.205;
        height /= 39.37;
        BMI = weight/(height * height);
        System.out.printf("BMI is %.4f",BMI);
    }
    
}
