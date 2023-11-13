/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FaangPreparation;

/**
 *
 * @author prash
 */
public class FinadSmallestLetterGreaterThanTargetUsingBinary {

    static char ceiling;
    static int count = 0;

    public static void main(String[] args) {

        char[] arr = {'c','f','j'};
        int end = arr.length - 1;
        char key = 'g';
        int start = 0;

        binarySearch(arr, key, start, end);
        System.out.println("Answer ==  " + ceiling);

    }

    private static void binarySearch(char[] arr, char key, int start, int end) {

        if (end >= start) {
            int mid = start + (end - start) / 2;
            if (key - 'a' >= arr[arr.length - 1] - 'a') {
                count++;
                ceiling = arr[0];
            }
//            if (arr[mid] - 'a' == key - 'a') {
//
//                count++;
//                ceiling = arr[mid];
//            }
            if (arr[mid] - 'a' <= key - 'a') {

                binarySearch(arr, key, mid + 1, end);
                if (arr[mid] - 'a' > key - 'a' && count != 1) {
                    count++;
                    ceiling = arr[mid];

                }
            } else {

                binarySearch(arr, key, start, mid - 1);
                if (arr[mid] - 'a' > key - 'a' && count != 1) {
                    count++;
                    ceiling = arr[mid];

                }

            }

        }

    }

}
