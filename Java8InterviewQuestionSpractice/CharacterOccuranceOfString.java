/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java8InterviewQuestionSpractice;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *
 * @author prash
 */
public class CharacterOccuranceOfString {

    public static void main(String[] args) {
        String input = "pprraa";

        Map<String, Long> map =  Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        
        System.err.println("Answer"+map.toString());

    }

}
