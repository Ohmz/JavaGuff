package net.ohmz.algorithms.practice.hackerrank.trees;

public class BinarySearchTreeInsertion {

    static Node Insert(Node root,int value)
    {
        Node node = new Node();
        node.data = value;
        if (root == null) {
            return node;
        }

        if (value < root.data) {
            if (root.left == null) {
                root.left = node;
            } else {
                Insert(root.left, value);
            }
        } else {
            if (root.right == null) {
                root.right = node;
            } else {
                Insert(root.right, value);
            }
        }
        return root;
    }
}
