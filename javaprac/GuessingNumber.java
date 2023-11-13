/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprac;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author prash
 */
public class GuessingNumber {

    public static void main(String args[]) {

        Random r = new Random();
        int low = 1;
        int high = 100;
        int result = r.nextInt(high - low) + low;
        System.out.println("Number Guess Result:" + result);
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int n;
        do {
            System.out.println("Please Enter your number number:> "+i);
            n = sc.nextInt();
            i++;
            if (result > n) {
                System.out.println("Your number is Lower than Guesser numner:");
                
            }
            if (result < n) {
                System.out.println("Your number is greater than Guesser numner:");
            } 
            
            if(result==n) {
                System.out.println("Your number is Mateched");
                break;
            }
        } while (i < 10);

    }
}
