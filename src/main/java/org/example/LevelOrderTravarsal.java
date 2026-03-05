package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTravarsal {
    /*
                         1
                        / \
                       2   3
                      /  \   \
                     4    5   6*/
    void levelOrder(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            Node current = queue.poll();
            System.out.print(current.val+" ");
            if (current.left!=null){
                queue.offer(current.left);
            }
            if (current.right!=null){
                queue.offer(current.right);
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
        LevelOrderTravarsal levelOrderTravarsal = new LevelOrderTravarsal();
       /* Level 1 → 1
        Level 2 → 2 3
        Level 3 → 4 5 6*/
        levelOrderTravarsal.levelOrder(root);
    }
}
