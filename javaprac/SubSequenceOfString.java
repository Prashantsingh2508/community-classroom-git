/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprac;

import java.util.HashSet;

/**
 *
 * @author prash
 */
public class SubSequenceOfString {

    public static void main(String args[]) {
        String str = "abc";
        int ind = 0;
//        HashSet set=new HashSet();
        subSequence(str, ind, "");
//        System.out.println(set);
    }

    private static void subSequence(String str, int ind, String newString) {

        if (ind == str.length()) {
//            set.add(newString);
            System.out.println(newString);
            return;

        }

        subSequence(str, ind + 1, newString + str.charAt(ind));
        subSequence(str, ind + 1, newString);

    }
}
