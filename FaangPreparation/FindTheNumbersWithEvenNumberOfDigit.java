/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FaangPreparation;

/**
 *
 * @author prash
 */
public class FindTheNumbersWithEvenNumberOfDigit {

    public static void main(String[] args) {
        int a[] = {123, 122, 222, 332, 11221};

        // Here we will count each number of digits
        int count = 0;
        for (int i = 0; i < a.length; i++) {

            if (even(a[i])) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean even(int a) {

        return digitCount(a) % 2 == 0;
    }

    private static int digitCount(int a) {

        int c = 0;

        while (a > 0) {

            c++;
            a /= 10;
        }

        return c;
    }

}
