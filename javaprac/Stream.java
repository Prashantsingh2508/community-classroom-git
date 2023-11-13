/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author prash
 */
public class Stream {

    public static void main(String args[]) {
        String s = "abs,abswwe,cbseee";
        int count = 0;
        List<String> list = new ArrayList<String>(Arrays.asList(s.split(",")));
        count = (int) list.stream().filter(a -> a.length() >= 6).count();
        System.out.println(count);

    }
}
