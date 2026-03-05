package org.example;

import java.util.Stack;

public class PostOrderTravarsal {

    /*
                 1
                / \
               2   3
              /  \   \
             4    5   6*/
    void postorder(Node root) {

        Stack<Node> stack = new Stack<>();
        Node curr = root;
        Node lastVisited = null;

        while (curr != null || !stack.isEmpty()) {

            if (curr != null) {
                stack.push(curr);
                curr = curr.left;
            } else {
                Node peek = stack.peek();
                if (peek.right != null && lastVisited != peek.right) {
                    curr = peek.right;
                } else {
                    System.out.print(peek.val + " ");
                    lastVisited = stack.pop();
                }
            }
        }
    }
    public static void main(String [] arg){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
       PostOrderTravarsal postOrderTravarsal = new PostOrderTravarsal();
       //4 5 2 6 3 1
       postOrderTravarsal.postorder(root);

    }
}
