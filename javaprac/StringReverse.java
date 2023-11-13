/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprac;

/**
 *
 * @author prash
 */
public class StringReverse {

    public static void main(String args[]) {

        String name = "navan";
        String rev = "";

        for (int i = name.length()-1; i>=0; i--) {

            rev += name.charAt(i);

        }

        System.out.println(rev);

    }

}
