/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaModulePractice;

/**
 *
 * @author prash
 */
public class ArrayIsSortedOrNot {

    static int c = 0, i = 0;

    public static void main(String args[]) {

        int a[] = {1,2,3,4,5};

        sort(a, a.length - 1);

    }

    private static void sort(int[] a, int l) {

        if (c == 1) {
            System.out.println("Unsorted");
            return;
        }

        if (i == l) {
            System.out.println("sorted");
            return;
        }

        if (!(a[i] <= a[i + 1])) {

            c = 1;

        }
        i++;
        sort(a, l);

    }

}
