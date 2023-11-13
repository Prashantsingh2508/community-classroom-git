/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java8InterviewQuestionSpractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author prash
 */
public class FindOutNumberWhichStartWith1fromArray {
    
    public static void main(String[] args) {
         int a[] = {89, 12, 34, 55, 99, 23, 1, 98, 22};

    List<String>  answer=   Arrays.stream(a).boxed().map(s->s+"").filter(t->t.startsWith("1")).collect(Collectors.toList());
                
                
                
            System.err.println("answet= "+answer);
    }
    
}
