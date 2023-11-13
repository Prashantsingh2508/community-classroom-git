/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprac;

/**
 *
 * @author prash
 */
public class MoveAllTheValueEndOfString {

    public static String add = "";
    public static String add2 = "";

    public static void main(String args[]) {

        String str = "axbcxxd";
        int idx = 0;
        char a = 'x';
        addString(str, idx, a);

    }

    private static void addString(String str, int idx, char a) {

        if (idx == str.length()) {

            System.out.println(add + add2);
            return;
        }

        if (str.charAt(idx) == a) {

            add2 += a;

        } else {

            add += str.charAt(idx);
        }
        addString(str, idx + 1, a);

    }

}
