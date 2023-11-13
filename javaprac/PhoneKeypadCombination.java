/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprac;

/**
 *
 * @author prash
 */
public class PhoneKeypadCombination {

    public static String keyPad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz"};

    public static void main(String args[]) {

        String num = "2";
        int ind = 0;
        String combination = "";
        subSequence(num, ind, combination);

    }

    private static void subSequence(String num, int ind, String combination) {

        if (ind == num.length()) {
            System.out.println(combination);
            return;
        }

        char str = num.charAt(ind);
        String mapping = keyPad[str - '0'];
        
        for (int i = 0; i < mapping.length(); i++) {
            subSequence(num, ind + 1, combination+mapping.charAt(i));

        }

    }
}
