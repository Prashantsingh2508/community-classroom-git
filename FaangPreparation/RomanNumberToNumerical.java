/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FaangPreparation;

/**
 *
 * @author prash
 */
public class RomanNumberToNumerical {

    public static void main(String[] args) {
        String s = "LVIII";
        romantoNumeric(s);
    }

    private static void romantoNumeric(String s) {

        int number = 0, prev = 0, ans = 0;

        for (int i = s.length() - 1; i >= 0; i--) {

            switch (s.charAt(i)) {
                case 'M' ->
                    number = 1000;
                case 'D' ->
                    number = 500;
                case 'C' ->
                    number = 100;
                case 'L' ->
                    number = 50;
                case 'X' ->
                    number = 10;
                case 'V' ->
                    number = 5;
                case 'I' ->
                    number = 1;

            }

            if (number < prev) {
              ans-=number;
            } else {
               ans+=number;
            }
            prev = number;
        }

        System.out.println(ans);

    }

}
