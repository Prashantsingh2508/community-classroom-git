/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprac;

/**
 *
 * @author prash
 */
public class FirstAndLastIndex {

    public static int first = -1;
    public static int last = -1;

    public static void main(String args[]) {

        String val = "abbabbac";
        int idx = 0;
        firstAndLastOccu(val, idx, 'a');

    }

    private static void firstAndLastOccu(String val, int idx, char element) {
        if (idx == val.length()) {
            System.out.println(first);
            System.out.println(last);
            return;

        }
        char currChar = val.charAt(idx);
        if (currChar == element) {
            if (first == -1) {
                first = idx;

            } else {
                last = idx;
            }

        }

        firstAndLastOccu(val, idx + 1, element);
    }

}
