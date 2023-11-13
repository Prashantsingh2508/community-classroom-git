/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaModulePractice;

/**
 *
 * @author prash
 */
public class PrintingPatternUsingRecursion {

    public static void main(String args[]) {

        triangle(4, 0);

    }

    private static void triangle(int r, int c) {

        if (r == 0) {

            return;
        }

        if (c < r) {

            triangle(r, c + 1);
            System.out.print("*");

        } else {
     
            triangle(r - 1, 0);
                    System.out.println();
           
        }
    }

}
