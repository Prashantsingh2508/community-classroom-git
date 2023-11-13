/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java8InterviewQuestionSpractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *
 * @author prash
 */
public class FindOutLongestStringInGivenArray {
    
    public static void main(String args[]){
    
    
            String str[]={"Apple","Banana","Watrermelon"};
            
        
System.out.println(Arrays.stream(str).map(t->t.length()).sorted(Comparator.reverseOrder()).findFirst().get());
    
System.out.println(Arrays.stream(str).reduce((i1,i2)->i1.length()>i2.length()?i1:i2).get());
                    
            
    
    }
    
            
        
}
