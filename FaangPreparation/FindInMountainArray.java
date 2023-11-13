/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FaangPreparation;

/**
 *
 * @author prash
 */
public class FindInMountainArray {

    public static void main(String args[]) {
        int arr[]={2,3,4,5,6,5,2,1};
        int target=5;
        int ans=search(arr,target);
        System.out.println(ans);
        
    }

    public  static int search(int[] arr, int target) {

        int peakIndex = peakIndex(arr);
        int firstTry = binarysearch(arr, target, 0, peakIndex);

        if (firstTry != -1) {

            return firstTry;
        }
        return binarysearch(arr, target, peakIndex + 1, arr.length - 1);
    }

    public static int binarysearch(int[] arr, int target, int start, int end) {

//        int start=0;
//        int end=arr.length-1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {

                if (target < arr[mid]) {
                    end = mid - 1;

                } else {

                    start = mid + 1;
                }

            } else {

                if (target > arr[mid]) {
                    end = mid - 1;

                } else {

                    start = mid + 1;
                }

            }

        }

        return -1;
    }

    public static int peakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

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
