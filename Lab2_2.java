
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author putth
 */
public class Lab2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("scissor (0), rock (1), paper (2):");
        int me = input.nextInt();
        int com = (int)(Math.random()* 3);
        String comout = "";
        String meout = "";
        switch(me){
            case 0: meout = "scissor";break;
            case 1: meout = "rock";break;
            case 2: meout = "paper";break;
        }
        switch(com){
            case 0: comout = "scissor";break;
            case 1: comout = "rock";break;
            case 2: comout = "paper";break;
        }
        
        if(me == com)
            System.out.println("The computer is " + comout + "." + "You are " + meout + ". It is a draw");
        else if( me == 0 && com == 1)
            System.out.println("The computer is " + comout + "." + "You are " + meout + ". You lose");
        else if( me == 0 && com == 2)
            System.out.println("The computer is " + comout + "." + "You are " + meout + ". You won");
        else if( me == 1 && com == 0)
            System.out.println("The computer is " + comout + "." + "You are " + meout + ". You won");
        else if( me == 1 && com == 2)
            System.out.println("The computer is " + comout + "." + "You are " + meout + ". You lose");
        else if( me == 2 && com == 0)
            System.out.println("The computer is " + comout + "." + "You are " + meout + ". You lose");
        else if( me == 2 && com == 1)
            System.out.println("The computer is " + comout + "." + "You are " + meout + ". You won");
    }
}
