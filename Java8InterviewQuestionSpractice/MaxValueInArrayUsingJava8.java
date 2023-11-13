/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java8InterviewQuestionSpractice;

import java.util.Arrays;

/**
 *
 * @author prash
 */
public class MaxValueInArrayUsingJava8 {
    
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 9, 2};
        int max = Arrays.stream(arr).min().getAsInt();
        System.out.println(max);
        Arrays.stream(arr).forEach(System.out::println);
    }
    
}
