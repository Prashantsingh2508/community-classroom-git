/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprac;

/**
 *
 * @author prash
 * 
 */
public class Factorial {

    public static void main(String args[]) {
        int n = 5;

        int ans = factorial(n);
        System.out.println("ans= "+ans);

    }

    private static int factorial(int n) {

        if (n <= 0) {

            return 1;
        }

        return n * factorial(n - 1);

    }

}
