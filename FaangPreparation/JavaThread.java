/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FaangPreparation;

/**
 *
 * @author prash
 */
class ThreadImpl implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {

            System.out.println(i << 1);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }

        }

    }
}

public class JavaThread {

    public static void main(String[] args) {

        ThreadImpl t = new ThreadImpl();
        Thread thread = new Thread(t);
        JavaThread2 jt = new JavaThread2();
        jt.start();
        thread.start();
        Thread.State state = thread.getState();
        System.out.println(state);
    }
}
