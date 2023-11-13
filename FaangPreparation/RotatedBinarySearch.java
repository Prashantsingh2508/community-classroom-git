/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FaangPreparation;

/**
 *
 * @author prash
 */
public class RotatedBinarySearch {

    public static void main(String args[]) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int ans = search(arr, target);
        System.out.println("Answer : " + ans);
    }

    private static int search(int[] arr, int target) {
        int pivot = findPivot(arr);
        System.out.println("Answer : " + pivot);
//            if array is not pivoted it means array is not rotated
        if (pivot == -1) {

            return binarySearch(arr, target, 0, arr.length - 1);

        }

        if (arr[pivot] == target) {
            return pivot;
        }
        if (target >= arr[0]) {

            return binarySearch(arr, target, 0, pivot - 1);

        }
        return binarySearch(arr, target, pivot + 1, arr.length - 1);

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

    static int findPivot(int arr[]) {

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
//                case 1
            if (mid < end && arr[mid] > arr[mid + 1]) {

                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {

                return mid - 1;
            }
            if (arr[mid] < arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
