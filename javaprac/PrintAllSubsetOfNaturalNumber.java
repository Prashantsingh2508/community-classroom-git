/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprac;

import java.util.ArrayList;

/**
 *
 * @author prash
 */
public class PrintAllSubsetOfNaturalNumber {

    public static void main(String args[]) {

        int n = 3;
        ArrayList<Integer> subset = new ArrayList<Integer>();
        subset(n, subset);

    }

    private static void subset(int n, ArrayList<Integer> subset) {

        if (n == 0) {
            printsubset(subset);
            return;
        }

        subset.add(n);
        subset(n - 1, subset);
        subset.remove(subset.size() - 1);
        subset(n - 1, subset);

    }

    private static void printsubset(ArrayList<Integer> subset) {

        for (int i = 0; i < subset.size(); i++) {

            System.out.print(subset.get(i));

        }
        System.out.println();

    }

}
