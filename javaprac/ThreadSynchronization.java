/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprac;

/**
 *
 * @author prash
 */
public class ThreadSynchronization {

    private final String name;

    public ThreadSynchronization(String name) {
        this.name = name;

    }

    public String getName() {

        return this.name;
    }

  
    public synchronized void call(ThreadSynchronization threadSynchronization){
        System.out.println(this.getName()+" called "+ threadSynchronization.getName());
        try{
          Thread.sleep(10000);
          
        }catch(Exception e){
            e.printStackTrace();
        
        }
        threadSynchronization.callMe(threadSynchronization);
    }
      public synchronized void callMe(ThreadSynchronization threadSynchronization){
           System.out.println(this.getName()+" called "+ threadSynchronization.getName());
    }
        public static void main(String args[]) {
                
            ThreadSynchronization threadSynchronization1=new ThreadSynchronization("Thread 1");
            ThreadSynchronization threadSynchronization2=new ThreadSynchronization("Thread 2");
            new Thread(new Runnable(){
            public void run(){
                threadSynchronization1.call(threadSynchronization2);
            }
            }).start();
               new Thread(new Runnable(){
            public void run(){
                threadSynchronization2.call(threadSynchronization1);
            }
            }).start();
            
    }
}

