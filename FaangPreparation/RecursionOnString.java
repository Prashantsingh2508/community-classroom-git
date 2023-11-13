/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FaangPreparation;

/**
 *
 * @author prash
 */
public class RecursionOnString {

    public static void main(String args[]) {

        String s = "bcaacb";
        String ans = "";
        System.err.println("ans  = "+ ans+s.substring(1));
        skip(s, ans);

    }

    private static void skip(String s, String ans) {

        if (s.isEmpty()) {

            System.out.println(ans);
        }

        char c = s.charAt(0);
        if (c == 'a') {

            skip(s.substring(1), ans);

        } else {

            skip(s.substring(1), ans + c);

        }
        
    }

}
