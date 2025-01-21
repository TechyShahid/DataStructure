package org.example;

import java.util.Scanner;

public class BinaryTree {

    private static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
           this.data=data;
        }
}
private Node root;
    public void populate(Scanner scanner){
        System.out.println("Enter the root Node: ");
        int data=scanner.nextInt();
        root=new Node(data);
        populate(scanner,root);
    }
    private void populate(Scanner scanner,Node node){
        System.out.println("Do you want to enter left of "+node.data);
        boolean left = scanner.nextBoolean();
        if (left){
            System.out.println("Please enter the value of left node "+node.data);
            int data=scanner.nextInt();
            node.left=new Node(data);
            populate(scanner,node.left);
        }
    }

}
