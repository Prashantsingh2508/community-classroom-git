/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprac;

/**
 *
 * @author prash
 */
public class CheckForSortedOrUnsortedArray {

    public static boolean isSorted = true;
    public static int i = 0;

    public static void main(String args[]) {

        int a[] = {1,3,3};
        isArraySorted(a, a.length - 1);

    }

    private static void isArraySorted(int a[], int length) {

        if (length <= 0) {
            System.out.println(isSorted);
            return;
        }
        if (a[i] >= a[i + 1]) {

            isSorted = false;

        } else {
            isSorted = true;
            
        }
        i++;
        isArraySorted(a, length - 1);
    }

}
