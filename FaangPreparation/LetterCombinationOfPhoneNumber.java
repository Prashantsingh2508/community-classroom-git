/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FaangPreparation;

/**
 *
 * @author prash
 */
public class LetterCombinationOfPhoneNumber {

    public static void main(String[] args) {

        pad("", "12");

    }

    private static void pad(String p, String up) {

        if (up.isEmpty()) {

            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {

            char ch = (char) ('a' + i);
            pad(p + ch, up.substring(1));

        }

    }

}
