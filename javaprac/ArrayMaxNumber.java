/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprac;

/**
 *
 * @author prash
 */
public class ArrayMaxNumber {

    public static void main(String args[]) {
        int a[] = {9, 1, 2, 2, 19};
//        int min = a[0];
//        for (int i = 1; i < a.length; i++) {
//
//            if (min>a[i]) {
//                min = a[i];
//            }
//            
//        }
//        System.out.println("Min=" + min);

        int length = a.length;
        int max = findMax(a, length-1);
        System.out.println("answer= "+max);

    }

    private static int findMax(int[] a, int length) {
        //System.out.println(length);
        if (length > 0) {
            return Math.max(a[length], findMax(a, length - 1));
        } else {
            return a[0];
        }
    }

}
