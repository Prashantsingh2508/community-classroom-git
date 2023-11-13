/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FaangPreparation;

/**
 *
 * @author prash
 */
public class RotationCount {

    public static void main(String args[]) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(countRotation(arr));
    }

    private static int countRotation(int[] arr) {
            return findPivot(arr)+1;
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
