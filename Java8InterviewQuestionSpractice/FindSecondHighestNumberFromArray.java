/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java8InterviewQuestionSpractice;

import java.awt.desktop.SystemEventListener;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author prash
 */
public class FindSecondHighestNumberFromArray {

    public static void main(String[] args) {
        int a[] = {89, 12, 34, 55, 99, 23, 1, 98, 22};

        Integer answer = Arrays.stream(a).boxed().sorted(Comparator.reverseOrder())
                .skip(1).findFirst().get();
             
                
            System.err.println("answet= "+answer);
    }

}
