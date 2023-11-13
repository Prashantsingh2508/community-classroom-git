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
public class BubbleSortUsingRecursion {

    public static void main(String args[]) {

        int arr[] = {3, 1, 5, 4, 2};

        int length = arr.length - 1;
        bubbleSort(arr, length);
        Arrays.stream(arr).forEach(a -> System.out.println(a));
        Arrays.sort(arr, 0, length);
        Arrays.stream(arr).forEach(a -> System.out.println(a));
    }

    private static void bubbleSort(int[] arr, int length) {

        boolean flag = true;

        for (int i = 0; i < length; i++) {

            if (arr[i] > arr[i + 1]) {

                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                flag = false;

            }
            if (!flag) {
                bubbleSort(arr, length);
            }

        }

    }

}
