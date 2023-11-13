/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaModulePractice;

/**
 *
 * @author prash
 */
public class DynamicFibonacciNumber {

    public static void main(String args[]) {

        int n = 6;
        int dp[] = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            dp[i] = -1;
        }
        int ans = fib(n, dp);
        System.out.println(ans);

    }

    private static int fib(int n, int[] dp) {
        if (n <= 1) {
            return n;
        }

        if (dp[n] != -1) {
            return dp[n];
        }
        dp[n] = fib(n - 1, dp) + fib(n - 2, dp);

        return dp[n];

    }
}
