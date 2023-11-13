/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprac;

/**
 *
 * @author prash
 */
public class CountPath {

    public static void main(String args[]) {

        int n = 3, m = 3;
        int ans = countPath(0, 0, n, m);
        System.out.println(ans);
    }

    private static int countPath(int i, int j, int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;

        }
        int rightPaths = countPath(i+1, j, n, m);
        int downPaths = countPath(i, j+1, n, m);
       int toatal= rightPaths + downPaths;
        return toatal;
    }

}
