/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FaangPreparation;

/**
 *
 * @author prash
 */
public class PrimeToRange {
static boolean ans = true;
    public static void main(String[] args) {

        matrix();

    }

    private static boolean prime(int num) {
        
        if (num == 2) {
            ans = true;
            return ans;
        }
        if (num == 1) {
            ans = false;
            return ans;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {

            if (num % i == 0) {

                ans = true;

            } else {

                ans = false;
            }

        }

        return ans;
    }

    private static void prime(int start, int end) {

        for (int i = start; i <= end; i++) {
            boolean flag = false;
            for (int j = 2; j <= Math.sqrt(start); j++) {

                if (i % j == 0) {

                    flag = true;
                }

            }
            if (flag) {

                System.out.println(i + " = Prime");
            }
        }
    }

    private static void matrix() {

        int a[][] = {{1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}};

        int row = a.length;
        int col = a[0].length;

        for (int i = 0; i < row; i++) {

            System.out.println(prime(a[i][i]));

        }
        ans=false;
        for (int i = 0; i < row; i++) {

            System.out.println(prime(a[i][row - i - 1]));

        }
    }

}
