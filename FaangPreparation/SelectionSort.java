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
public class SelectionSort {

    public static void main(String[] args) {

        int arr[] = {4, 5, 1, 2, 3};

        selectionSort(arr, arr.length);
        Arrays.stream(arr).forEach(a -> System.out.println(a));

    }

    private static void selectionSort(int[] arr, int length) {

        for (int i = 0; i < length-1; i++) {

            int minIndex = i;
            for (int j = i + 1; j < length ; j++) {

                if (arr[j] < arr[minIndex]) {

                    minIndex = j;

                }

            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

        }

    }

}
