/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprac;

/**
 *
 * @author prash
 */
public class DynamicProgramming1 {

    public static void main(String args[]) {

        int a[] = {7, 5, 1};
        int n = 18;
        int ans = sumOfArray(a, n);
        System.out.println(ans);

    }

    static int sumOfArray(int a[], int n) {

        if (n == 0) {
            return 0;
        }
        int max = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (n - a[i] >= 0) {
                int sum = sumOfArray(a, n - a[i]);
                if (sum != Integer.MAX_VALUE && sum + 1 < max) {
                    max=sum+1;
                }
            }
        }

        return max;
    }

}
