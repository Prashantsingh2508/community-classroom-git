/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FaangPreparation;

/**
 *
 * @author prash
 */
public class PeakIndexInMountainInArray {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 11, 10, 9, 8, 7};

         int ans = peakIndexNumber(arr, 0, arr.length - 1);

        System.out.print(ans);

    }

    private static int peakIndexNumber(int[] arr, int start, int end) {
        int ans = 0;

        start = 0;
        end = arr.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {

                end = mid;
            } else {

                start = mid + 1;

            }

        }

        return start;

    }

}
