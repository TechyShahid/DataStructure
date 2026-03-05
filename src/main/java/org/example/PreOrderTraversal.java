package org.example;

import java.util.Stack;

public class PreOrderTraversal {
    /*
                     1
                    / \
                   2   3
                  /  \   \
                 4    5   6*/
    void preOrder(Node root){
        if(root==null){
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            Node temp = stack.pop();
            System.out.print(temp.val+" ");
            if(temp.right!=null){
                stack.push(temp.right);
            }
            if (temp.left!=null){
                stack.push(temp.left);
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
        PreOrderTraversal pre = new PreOrderTraversal();
        //1 → go left → 2 → go left → 4 → back → 5 → back → go right → 3 → 6
        pre.preOrder(root);

    }
}
