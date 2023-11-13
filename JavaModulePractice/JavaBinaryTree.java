/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaModulePractice;

/**
 *
 * @author prash
 */
public class JavaBinaryTree {

    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();
        tree.addNode(50);
        tree.addNode(25);
        tree.addNode(75);
        tree.addNode(12);
        tree.addNode(37);
        tree.addNode(43);
        tree.addNode(30);

        tree.preOrderTraversal(tree.root);

    }

}

class Node {

    int key;
    Node left, right;

    public Node(int item) {
        this.key = item;

    }
}

class BinaryTree {

    Node root;

    public void addNode(int data) {
        Node node = new Node(data);
        if (root == null) {
            root = node;
        } else {
            Node fNode = root;
            Node parent;
            while (true) { // Traversing the data from one node to another node
                parent = fNode;
                if (data < fNode.key) {
                    fNode = fNode.left;// this code for traversing the Node from one node to another Node
                    if (fNode == null) { // Here we did  if the it is first time of making 
                        parent.left = node;
                        return;
                    }
                } else {
                    fNode = fNode.right;
                    if (fNode == null) {
                        parent.right = node;
                        return;
                    }
                }

            }
        }

    }

    public void preOrderTraversal(Node traversal) {

        if (traversal != null) {
            System.out.println(" data -->>" + traversal.key);
            preOrderTraversal(traversal.left);
            preOrderTraversal(traversal.right);

        }
    }
}
