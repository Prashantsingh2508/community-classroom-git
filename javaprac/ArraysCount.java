/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author prash
 */
public class ArraysCount {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(256741038);
        arr.add(623958417);
        arr.add(467905213);
        arr.add(714532089);
        arr.add(938071625);

        Collections.sort(arr);
        long sum = 0;

        sum = arr.stream().mapToInt(Integer::intValue).sum();
        System.out.print((sum - arr.get(arr.size() - 1)) + " " + (sum - arr.get(0)));

    }

    public static ArrayList<Integer> sortArrayList(List<Integer> inputList) {
        // Create a new ArrayList to avoid modifying the original list
        ArrayList<Integer> sortedList = new ArrayList<>(inputList);

        // Sort the new list
        Collections.sort(sortedList);

        return sortedList;
    }

}
