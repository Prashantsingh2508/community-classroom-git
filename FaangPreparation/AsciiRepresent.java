/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FaangPreparation;

/**
 *
 * @author prash
 */
public class AsciiRepresent {

   public static void main(String[] args) {

    String asci = "796115110113721110141108";

    StringBuilder sb = new StringBuilder(asci);
    sb.reverse();
    String ans = sb.toString();

    System.err.println("" + ans);
    String current = "";
    int i = 0;
    String res = "";
    
    try {
        while (i < ans.length() - 1) {

            current = "";
            current += ""+ans.charAt(i) + ans.charAt(i + 1);
            int data = Integer.parseInt(current); // Parse 'current', not 'ans'
         
            
            if (data == 32) {
                res += "";
            } else if ((data >= 65 && data <= 90) || (data >= 97 && data <= 99)) {
                res += (char) data;
            } else{
                // Parse the next three characters as an integer
                current +=""+ans.charAt(i + 2);
                res += (char) Integer.parseInt(current);
                i += 1; // Skip the next two characters
            }
            i += 2;
        }
    } catch (NumberFormatException e) {
        System.out.println("NumberFormatException: " + e.toString());
    }
    
    System.out.println("Result: " + res);
}


}
