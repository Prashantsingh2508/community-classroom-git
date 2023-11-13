/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaprac;

/**
 *
 * @author prash
 */
public class LinkedList {

    Node head;

    class Node {

        String data;
        Node next;

        Node(String data) {

            this.data = data;
            this.next = null;

        }

    }

    public void addFirst(String data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;

        }
        head.next = node;
        node.next = null;

    }

    public void print() {

        while (head.next != null) {

            System.out.println(head.data);

        }
    }

    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.addFirst("Hello");
        ll.addFirst("Hi");
        ll.addFirst("How are you");
        ll.print();
    }
}
