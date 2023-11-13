/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FaangPreparation;

import java.util.Arrays;
import java.util.function.IntConsumer;

/**
 *
 * @author prash
 */
public class FirstAndLastElementInSortedArrayUsingBinary {

    public static void main(String[] args) {

        int arr[] = {11, 12, 13, 15, 14, 19, 20, 34};

        int key = 15;

        int ans[] = searchRange(arr, key);
        Arrays.stream(ans).forEach(System.out::println);

    }

    private static int[] searchRange(int[] arr, int key) {

        int ans[] = {-1, -1};

        ans[0] = search(arr, key, true);
        ans[1] = search(arr, key, false);
        return ans;
    }

    private static int search(int[] arr, int key, boolean b) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;
            System.out.println("Mid Answer = " + mid);
            if (arr[mid] < key) {

                start = mid + 1;

            } else if (arr[mid] > key) {

                end = mid - 1;
            } else {
                ans = mid;
                if (b) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }

        }
        return ans;
    }
}
