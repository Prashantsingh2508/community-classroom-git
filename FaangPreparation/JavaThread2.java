/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FaangPreparation;

/**
 *
 * @author prash
 */
public class JavaThread2 extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {

            System.out.println(" Antoher Thread Are Running with Concurrently==  "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }

        }

    }

    public static void main(String args[]) {

        JavaThread2 javaThread2 = new JavaThread2();
        javaThread2.start();

    }
}
