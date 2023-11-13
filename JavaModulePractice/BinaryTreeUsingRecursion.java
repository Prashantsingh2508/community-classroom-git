/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaModulePractice;

import java.util.Scanner;

/**
 *
 * @author prash
 */
public class BinaryTreeUsingRecursion {

    static Scanner sc = null;

    public static void main(String args[]) {
        sc = new Scanner(System.in);
        Node root = makeTree();
        printBinaryTreeAsPreorderTraversal(root);

    }

    static Node makeTree() {
        Node root = null;
        System.out.println("Enter Data: ");
        int data = sc.nextInt();
        if (data == -1) {

            return null;
        }
        root = new Node(data);
        // Scanner sc=new Scanner(System.in);
        System.out.println("data for Left Node >>" + data);

        root.left = makeTree();
        System.out.println("data for Right Node >>" + data);
        root.right = makeTree();
        return root;

    }

    public static void printBinaryTreeAsPreorderTraversal(Node traverse) {

        if (traverse == null) {

            return;

        }
        printBinaryTreeAsPreorderTraversal(traverse.left);
        System.out.println(traverse.data);
        printBinaryTreeAsPreorderTraversal(traverse.right);
        //System.out.println(traverse.data);

    }

}

class Node {

    Node left, right;
    int data;

    public Node(int key) {

        this.data = key;
        this.left = null;
        this.right = null;

    }

}
