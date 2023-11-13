/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprac;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author prash
 */
public class PermutationString {

    public static void main(String args[]) {
        ArrayList<ArrayList<Integer>> nums = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);
        ans.add(2);
        ans.add(3);

        //nums.add((ArrayList<Integer>) ans);

        int index = 0;
        solve(nums, ans, index);
        System.out.println("ans====" + nums);
    }

    static void swap(ArrayList<ArrayList<Integer>> a, int i, int j) {
        ArrayList<Integer> temp = a.get(i);
        Integer temp1=temp.get(0);
        a.add(a.get(j));
      //  a.add(temp1.intValue().);
    }

    private static void solve(ArrayList<ArrayList<Integer>> nums, ArrayList<Integer> ans, int index) {
        System.out.println("1=" + nums.size());
        if (index > nums.size()) {
            nums.add((ArrayList<Integer>) ans);
            return;

        }
      //  System.out.println("4");
        for (int i = index; i < ans.size(); i++) {
          //  System.out.println("2");
            swap( nums, index, i);
            solve(nums, ans, index + 1);
            //System.out.println("3");
            swap(nums, index, i);
        }

    }
}
