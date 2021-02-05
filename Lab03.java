import java.util.Scanner;
public class Lab03 {
    public static void main(String[] args) {
        int min = 0;
        int max = 1000;
        int sum = 0;
        int remainder;
        System.out.println("Enter integer between 0 and 1000: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if( 0 < number && number < 1000){
            for(int i = 0;i < 3;i++){
                remainder = number%10;
                number/=10;
                sum+=remainder;
            }
            System.out.println(sum);
        }
        else{
            System.out.println("Error");
        }
    }
}
