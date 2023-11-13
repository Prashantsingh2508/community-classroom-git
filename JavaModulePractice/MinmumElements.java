/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaModulePractice;

/**
 *
 * @author prash
 */
public class MinmumElements {

    public static void main(String args[]) {

        int num[] = {1, 2, 3};
        int ans = solveRec(num, 7);
        System.out.println(""+ans);

    }

    private static int solveRec(int[] num, int x) {

        if (x == 0) {
            return 0;
        }
        if (x < 0) {
            return Integer.MAX_VALUE;
        }
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
        
            int ans=solveRec(num, x-num[i]);
            if(ans!=Integer.MAX_VALUE){
            
                mini=Math.min(mini,1+ans);
            }
        }
        return mini;
    }

}
