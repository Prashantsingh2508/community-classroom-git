/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java8InterviewQuestionSpractice;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *
 * @author prash
 */
public class FindFirstNonRepeatElementFromString {
    public static void main(String[] args) {
         String str = "ilovejavatechie";
String list= Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(i->i.getValue()==1)
                .findFirst().get().toString();
 
        System.err.println("Output = "+list.toString());
    }
}
