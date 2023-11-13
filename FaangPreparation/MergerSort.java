/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FaangPreparation;

import java.util.*;

/**
 *
 * @author prash
 */
public class MergerSort {

    public static void main(String arr[]) {

        int[] a = {5, 4, 1, 2, 1,7,8,3};
        a = mergeSort(a);
        System.out.println(Arrays.toString(a));
    }

    static int[] mergeSort(int[] a) {
        if (a.length == 1) {

            return a;
        }

        int mid = a.length / 2;

        int left[] = mergeSort(Arrays.copyOfRange(a, 0, mid));
        int right[] = mergeSort(Arrays.copyOfRange(a, mid, a.length));
       
         return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {

        int main[] = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {

            if (left[i] < right[j]) {

                main[k++] = left[i++];
            } else {
                main[k++] = right[j++];

            }

        }
        while (i < left.length) {

            main[k++] = left[i++];
        }
        while (j < right.length) {
            main[k++] = right[j++];

        }

        return main;
    }
}
