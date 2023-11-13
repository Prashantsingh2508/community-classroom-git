/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprac;

/**
 *
 * @author prash
 */
public class PermutaionsOfString {

    public static void main(String args[]) {

        String str = "abc";
        permu(str, "");
    }
//abc
//acb
//bac
//bca
//cab
//cba
    private static void permu(String str, String string) {

        if (str.length() == 0) {

            System.out.println(string);
            return;

        }
         for (int i = 0; i < str.length(); i++) {
          //  System.out.println("-->"+i);
            char currChar = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i + 1);
            permu(newString, string + currChar);
        }

    }

}
