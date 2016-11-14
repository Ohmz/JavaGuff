package net.ohmz.algorithms.practice.hackerrank.trees;

public class TopView {

    void top_view(Node root)
    {
        if (root == null) return;
        goLeft(root.left);
        System.out.print(root.data);
        goRight(root.right);
    }

    void goLeft(Node node) {
        if (node == null) return;
        goLeft(node.left);
        System.out.print(node.data + " ");

    }

    void goRight(Node node) {
        if (node == null) return;
        System.out.print(" " + node.data);
        goRight(node.right);
    }
}
