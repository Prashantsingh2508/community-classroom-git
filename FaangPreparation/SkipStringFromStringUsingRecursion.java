/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FaangPreparation;

/**
 *
 * @author prash
 */
public class SkipStringFromStringUsingRecursion {

    public static void main(String[] args) {
        String str = "wefapplefgh";

        String ans = skip(str);

        System.err.println("answer :" + ans);

    }

    private static String skip(String str) {

        if (str.isEmpty()) {

            return "";
        }

        if (str.startsWith("apple")) {
            return skip(str.substring(5));
        } else {
            char a = str.charAt(0);
            return a + skip(str.substring(1));
        }

    }

}
