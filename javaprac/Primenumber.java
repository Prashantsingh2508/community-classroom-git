/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprac;

/**
 *
 * @author prash
 */
public class Primenumber {

    public static void main(String args[]) {

        for (int i = 2; i < 100; i++) {
            int count = 0;
            for (int j = 2; j <= i / 2; j++) {

                if (i % j == 0) {

                    count++;
                    break;

                }

            }
            if (count == 0) {
                System.out.println(i);

            }

        }

    }

}
