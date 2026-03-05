package org.example;

public class InvertTree {
    public Node invertTree(Node root){
        if (root==null){
            return null;
        }
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
    public static void main(String [] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        InvertTree invertTree = new InvertTree();
        invertTree.invertTree(root);
        LevelOrderTravarsal levelOrderTravarsal = new LevelOrderTravarsal();
       /* Level 1 → 1
        Level 2 → 2 3
        Level 3 → 4 5 6*/
        levelOrderTravarsal.levelOrder(root);
    }
}
