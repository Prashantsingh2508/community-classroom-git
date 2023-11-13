/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java8InterviewQuestionSpractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *
 * @author prash
 */
public class FindAllUniqueElementFromString {
    public static void main(String[] args) {
        
        String str="qsdqsdfakcq";
        
        List<String> list=Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(map->map.getValue()==1)
                .map(Map.Entry::getKey).collect(Collectors.toList());
        System.err.println("Answer = "+list.toString());
    }
}
