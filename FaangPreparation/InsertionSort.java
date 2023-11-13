/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FaangPreparation;

import java.util.Arrays;

/**
 *
 * @author prash
 */
public class InsertionSort {

    public static void main(String[] args) {
        int arr[] = {4, 5, 1, 2, 3};

        insertionSort(arr, arr.length);
        Arrays.stream(arr).forEach(a -> System.out.println(a));
        }

    private static void insertionSort(int[] arr, int length) {

        for (int i = 0; i <= length - 2; i++) {

            for (int j = i + 1; j > 0; j--) {

                if (arr[j] < arr[j - 1]) {

                    Swap.swap(arr, j, j - 1);

                } else {
                    break;
                }
            }
        }

    }

}
