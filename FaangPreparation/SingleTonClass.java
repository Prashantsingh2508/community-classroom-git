/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FaangPreparation;

/**
 *
 * @author prash
 */
public class SingleTonClass {

    private static SingleTonClass st = null;

    private SingleTonClass() {
    }

    public static SingleTonClass getSingle() {
        if (st == null) {
            st = new SingleTonClass();
        }
        return st;
    }

}
