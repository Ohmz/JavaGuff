package net.ohmz.algorithms.practice.hackerrank.trees;

public class IsThisABinarySearchTree {
    boolean checkBST(Node root) {
        java.util.List<Integer> inOrderList = new java.util.ArrayList<Integer>();
        inOrder(root,inOrderList);

        for (int i = 0; i < inOrderList.size() - 1 ; i++ ) {
            if (inOrderList.get(i) >= inOrderList.get(i+1)) {
                return false;
            }
        }

        return true;
    }
    void inOrder(Node root, java.util.List<Integer> inOrderList) {
        if (root == null) return;
        inOrder(root.left, inOrderList);
        inOrderList.add(root.data);
        inOrder(root.right, inOrderList);
    }
}
