package net.ohmz.algorithms.practice.self.trees;

public class Node {
    private int value;
    private Node left;
    private Node right;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return this.left;
    }

    public Node getRight() {
        return this.right;
    }

    public void setLeft(Node node) {
        this.left = node;
    }

    public void setRight(Node node) {
        this.right = node;
    }

    public void print() {
        print("",true);
    }

    private void print(String prefix, boolean isTail) {
        System.out.println(prefix + (isTail ? "└── " : "├── ") + value);
        if (getLeft() != null) {
            getLeft().print(prefix + (isTail ? "    " : "│   "), false);
        } else {
            System.out.println(prefix + (isTail ? "└── " : "├── ") + "null");
        }

        if (getRight() != null) {
            getRight().print(prefix + (isTail ? "    " : "│   "), false);
        } else {
            System.out.println(prefix + (isTail ? "└── " : "├── ") + "null");
        }
    }
}
