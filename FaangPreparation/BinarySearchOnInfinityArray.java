/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FaangPreparation;

/**
 *
 * @author prash
 */
public class BinarySearchOnInfinityArray {

    public static void main(String args[]) {

        int arr[] = {14, 16, 17, 18, 24, 25, 26, 28, 81, 89, 90, 91, 92, 93};

        int key = 28;
        int start = 0;
        int end = arr.length - 1;
        int ans = searchInFinite(arr, key);
        System.out.println(ans);

    }

    private static int searchInFinite(int[] arr, int key) {

        int start = 0;
        int end = 1;

        while (key > arr[end]) {

            int temp = end + 1;

            end = end + (end - start + 1) * 2;
            start = temp;
        }

        return binarySearch(arr, key, start, end);
    }

    private static int binarySearch(int[] arr, int key, int start, int end) {

        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (arr[mid] < key) {
                start = mid + 1;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                return mid;
            }

        }
        return -1;
    }

}
