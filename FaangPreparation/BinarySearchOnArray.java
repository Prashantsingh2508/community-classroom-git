/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FaangPreparation;

/**
 *
 * @author prash
 */
public class BinarySearchOnArray {

    static int ceiling = 0;
    static int count = 0;

    public static void main(String[] args) {

        int arr[] = {14,16,17,18, 24, 25, 26, 28, 81, 89, 90, 91, 92, 93};

        int key = 95;
        int start = 0;
        int end = arr.length - 1;
        binarySearch(arr, key, start, end);
        System.out.println("Answer" + ceiling);

    }

    private static void binarySearch(int[] arr, int key, int start, int end) {

        if (end >= start) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
            
//                count++;
//                ceiling = arr[mid];
            }
            if (arr[mid] <= key) {

                binarySearch(arr, key, mid + 1, end);
//                if (arr[mid] >= key && count != 1) {
//                    count++;
//                    ceiling = arr[mid];
//
//                }
            } else {

                binarySearch(arr, key, start, mid - 1);
//                if (arr[mid] >= key && count != 1) {
//                    count++;
//                    ceiling = arr[mid];
//
//                }

            }

        }

    }

}
