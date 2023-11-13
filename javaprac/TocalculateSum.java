/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprac;

/**
 *
 * @author prash
 */
public class TocalculateSum {

    public static void main(String args[]) {
        int n = 2;
        int sum = 0;
        int ans = toCalSum(n, sum);
        System.out.println(ans);
    }

    public static int toCalSum(int n, int sum) {

        if (n <=0) {
            return 0;
        }
       
          return n+toCalSum(n - 1, sum);
     
    }

}
