package net.ohmz.algorithms.practice.hackerrank.trees;

public class HeightOfBinaryTree {
    static int getHeight(Node root) {
        if (root == null) return -1;
        return 1 + max(getHeight(root.left), getHeight(root.right));
    }

    static int max(int l, int r) {
        return l > r ? l : r ;
    }
}
