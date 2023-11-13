/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprac;

/**
 *
 * @author prash
 */
public class RemoveDuplicatesFromString {

    public static boolean map[] = new boolean[26];

    public static void main(String args[]) {

        String str = "abbccda";
        int ind = 0;
        removeChar(str, ind, "");
        System.out.println(map[25]);
    }

    private static void removeChar(String str, int ind, String newString) {

        if(ind==str.length()){
        System.out.println(newString);
        return;
        }
        if (map[str.charAt(ind) - 'a']==true) {
            removeChar(str, ind + 1, newString);

        } else {
            newString += str.charAt(ind);
            map[str.charAt(ind) - 'a'] = true;
            removeChar(str, ind + 1, newString);
        }

    }
}
