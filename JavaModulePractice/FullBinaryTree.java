/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaModulePractice;

/**
 *
 * @author prash
 */
public class FullBinaryTree {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.addNode(20);
        binaryTree.addNode(12);
        binaryTree.addNode(11);
        binaryTree.addNode(32);
        binaryTree.addNode(18);
        binaryTree.addNode(21);
        binaryTree.addNode(33);
        binaryTree.printBinaryTreeAsPreorderTraversal(binaryTree.root);
    }

}

class Node {

    int key;
    Node left;
    Node right;

    public Node(int data) {

        this.key = data;
        this.left = null;
        this.right = null;
    }

}

class BinaryTree {

    Node root;

    public void addNode(int data) {
        Node newNode = new Node(data);
        // System.out.println(data);
        if (root == null) {

            root = newNode;
        } else {
            Node fNode = root;
            Node parent;
            while (true) {

                parent = fNode;

                if (data < fNode.key) {

                    fNode = fNode.left;
                    if (fNode == null) {
                        parent.left = newNode;
                        return;

                    }

                } else {

                    fNode = fNode.right;
                    if (fNode == null) {
                        parent.right = newNode;
                        return;

                    }

                }

            }

        }
    }

    public void printBinaryTreeAsPreorderTraversal(Node traverse) {

        if (traverse != null) {

            System.out.println("Data of->>>  binary Tree" + traverse.key);
            printBinaryTreeAsPreorderTraversal(traverse.left);
            printBinaryTreeAsPreorderTraversal(traverse.right);

        }

    }
}
