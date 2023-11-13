/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprac;

/**
 *
 * @author prash
 */
public class StringReverseUsingRecursion {

    public static void main(String args[]) {

        String rev = "abcd";
        reverse(rev, rev.length() - 1);
    }

    private static void reverse(String rev, int length) {

        if (length < 0) {

            return;

        }

        System.out.println(rev.charAt(length));
        reverse(rev, length - 1);
    }

}
