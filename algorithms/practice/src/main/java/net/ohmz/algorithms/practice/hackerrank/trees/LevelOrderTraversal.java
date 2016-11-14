package net.ohmz.algorithms.practice.hackerrank.trees;

public class LevelOrderTraversal {
    void LevelOrder(Node root)
    {
        int height = getHeight(root);
        for (int i = 0 ; i <= height; i++) {
            printLevel(root, i);
        }
    }

    void printLevel(Node node, int i) {
        if (node == null) return;
        if (i == 0) {
            System.out.print(node.data+ " ");
            return;
        } else {
            printLevel(node.left, i - 1);
            printLevel(node.right, i - 1);
        }
    }

    int getHeight(Node root) {
        if (root == null) return -1;
        return 1 + max(getHeight(root.left), getHeight(root.right));
    }

    int max(int l, int r) {
        return l > r ? l : r;
    }
}
