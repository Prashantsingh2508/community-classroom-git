package javaprac;

/**
 *
 * @author prash
 */
public class StaticClass {

    Node head;
   
    static class Node {

        int data;
        Node next;
       
        Node(int data) {
            next = null;
            data = data;
        }
    
}
    public static void main(String args[]) {
        StaticClass list = new StaticClass();
        list.head = new Node(1);
        Node node = new Node(2);

    }

}
