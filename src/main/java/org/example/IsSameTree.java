package org.example;

public class IsSameTree {
    public boolean isSame(Node n1, Node n2) {
        if (n1 == null && n2 == null) return true;
        if (n1 == null || n2 == null) return false;
        if (n1.val != n2.val) return false;

        return isSame(n1.left, n2.left) && isSame(n1.right, n2.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        Node root1 = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        InvertTree invertTree = new InvertTree();
        Node invert = invertTree.invertTree(root);
        LevelOrderTravarsal levelOrderTravarsal = new LevelOrderTravarsal();
        levelOrderTravarsal.levelOrder(invert);
        System.out.println("");
        levelOrderTravarsal.levelOrder(root);
        IsSameTree isSameTree = new IsSameTree();
        System.out.println("");
        System.out.println(isSameTree.isSame(root, invert));
        System.out.println(isSameTree.isSame(root1, invert));
    }
}
