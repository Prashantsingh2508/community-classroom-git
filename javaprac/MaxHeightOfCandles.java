/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprac;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author prash
 */
public class MaxHeightOfCandles {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList();
//        list.add(82);
//        list.add(49);
//        list.add(82);
//        list.add(82);
//        list.add(41);
//        list.add(82);
//        list.add(15);
//        list.add(63);
//        list.add(38);
//        list.add(25);
list.add(3);
list.add(2);
list.add(1);
list.add(3);
list.add(4);
list.add(5);
list.add(4);
       
        int max=0;
        for (int i = 0; i < list.size() - 1; i++) {
             int count = 1;
            for (int j = i + 1; j < list.size() ; j++) {
                if (Objects.equals(list.get(i), list.get(j))) {

                    count++;

                }
            }
                
                if(count>max){
                    max=count;
                }
            
                    
        }

        System.out.println(max);

    }

}
