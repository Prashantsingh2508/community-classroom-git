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

/*
        String str="qqwerrfggdsagqw";Map<String , Long> ans=Arrays.stream(str.)*
 *
 * @author prash
 */
public class FindAllDuplicateElementFromString {

    public static void main(String args[]) {

        String str = "qqwerrfggdsagqw";
 List<String> list= Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(i->i.getValue()>1)
                .map(Map.Entry::getKey).collect(Collectors.toList());
 
        System.err.println("Output+ "+list);
    }

}
