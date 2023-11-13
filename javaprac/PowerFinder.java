/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprac;

/**
 *
 * @author prash
 */
public class PowerFinder {

    public static void main(String args[]) {

        int x = 2;
        int y = 5;
        int ans = power(x, y);
        System.out.println(ans);

    }

    public static int power(int x, int y) {
        if (y == 0) {

            return 1;
        }
        int ans = power(x, y - 1);
        int power = ans * x;
        return power;
    }

}
