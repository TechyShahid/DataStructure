package org.example;

public class IsSymetricTree {
    boolean isSymetricTree(Node root){
        Node left = root.left;
        return isSame(left,root.right);
    }
    Node invert(Node root){
        if(root ==null){
            return root;
        }
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        invert(root.left);
        invert(root.right);
        return root;
    }
    boolean isSame(Node n1,Node n2){
        if(n1==null && n2==null) return true;
        if(n1==null || n2==null) return false;
        if(n1.val!=n2.val) return false;

        return isSame(n1.left,n2.left) && isSame(n1.right,n2.right);
    }

    public static void main(String [] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        IsSymetricTree isSymetricTree = new IsSymetricTree();
        System.out.print(isSymetricTree.isSymetricTree(root));
    }
}
