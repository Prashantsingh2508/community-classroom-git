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
public class RowColMatrix {

    public static void main(String args[]) {

        int[][] arr = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {28, 29, 37, 49},
             {33, 34, 38, 50}
        };
        System.out.println("Arrays Search = " + Arrays.toString(search(arr, 37)));
    }

    static int[] search(int[][] matrix, int target) {

        int r = 0;
        int c = matrix[0].length - 1;
        System.out.println("Row .length = " + matrix.length);
        while (r < matrix.length && c >= 0) {

            if (matrix[r][c] == target) {

                return new int[]{r, c};
            }
            if (matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }

        }

        return new int[]{-1, -1};
    }

}
