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
public class Lab6_3 {
    public static void main(String[] args) {

        Queue queue = new Queue();
        // inserting 20 numbers into queue
        for (int i = 1; i <= 20; i++) {
            queue.enqueue(i);
            System.out.println(i);
        }

        
        //for (int i = 0; i < 20; i++) {
            System.out.printf("dequeue %d ", queue.dequeue());
        //}
        System.out.println("\nisEmpty: "+ queue.isEmpty());
    }
}
