/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FaangPreparation;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author prash
 */
public class ArrayDuplicate {

    public static void main(String args[]) {

        Integer a[] = {1, 2, 3, 4, 2, 3, 2, 3, 5, 6, 4, 5, 6};

        int length = a.length - 1;
        int flag = -1;
        int count = 0;
        for (int i = 0; i < length; i++) {

            if (a[i] != -1) {

                for (int j = i; j < length; j++) {

                    if (a[i] == a[j + 1]) {

                        a[j + 1] = flag;
                        count++;
                    }
                }
            }

        }
        List<Integer> numberList = (List<Integer>) Arrays.asList(a);
        System.out.println();

    }

}
