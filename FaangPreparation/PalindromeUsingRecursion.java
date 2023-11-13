/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FaangPreparation;

/**
 *
 * @author prash
 */
public class PalindromeUsingRecursion {

    static int i = 0;
    static boolean answer = true;

    public static void main(String[] args) {
        String data = "naman";
        palidrome(data, data.length() - 1);
        System.out.println(answer);
    }

    private static void palidrome(String data, int size) {
        if ( size < 0 || i == size) {
            return;
        }
        if (data.charAt(i) == data.charAt(size)) {
            i++;
            size--;
            palidrome(data, size);
        } else {
            answer = false;
            return;
        }

    }

}
