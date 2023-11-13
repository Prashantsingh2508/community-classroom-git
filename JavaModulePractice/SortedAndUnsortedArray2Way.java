/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaModulePractice;

/**
 *
 * @author prash
 */
public class SortedAndUnsortedArray2Way {

    public static void main(String args[]) {

        int a[] = {1, 2, 3, 4, 6, 7, 1};

        System.out.println(sort(a, 0));

    }

    private static boolean sort(int[] a, int i) {

        if (i == a.length - 1) {

            return true;

        }
        return a[i]<a[i+1] && sort(a,i+1);

    }

}
