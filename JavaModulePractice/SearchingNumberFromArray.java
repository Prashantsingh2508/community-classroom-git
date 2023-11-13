/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaModulePractice;

/**
 *
 * @author prash
 */
public class SearchingNumberFromArray {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 6, 7, 5};
        System.out.println(search(a, 5, 0));
    }

    private static boolean search(int[] a, int target, int index) {

        if (index == a.length) {

            return false;
        }

        return a[index] == target || search(a, target, index + 1);
    }

}
