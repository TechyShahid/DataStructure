package org.example;

import java.util.Stack;

public class InOrderTravarsal {
 /*
Algorithm Idea
Go left as much as possible
When left becomes null → pop node
Print node
Move to right subtree
Repeat
    */
/*
                     1
                    / \
                   2   3
                  /  \   \
                 4    5   6*/
    void inorder(Node root) {

        Stack<Node> stack = new Stack<>();
        Node curr = root;
        while (curr != null || !stack.isEmpty()) {

            if (curr != null) {
                stack.push(curr);      // go left
                curr = curr.left;
            } else {
                curr = stack.pop();    // visit node
                System.out.print(curr.val + " ");
                curr = curr.right;     // go right
            }
        }
    }
    public static void main(String [] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
      InOrderTravarsal inOrderTravarsal = new InOrderTravarsal();
      //4 2 5 1 3 6
      inOrderTravarsal.inorder(root);
    }
}
