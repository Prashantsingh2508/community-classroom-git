/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java8InterviewQuestionSpractice;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author prash
 */
public class StringJoinFunction {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("1", "2", "3", "4");
        String result = String.join("t", list);
        System.err.println("answer = " + result);
    }

}
