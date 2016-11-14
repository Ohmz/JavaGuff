package net.ohmz.algorithms.practice.self.trees;
public class SampleTrees {
    public static Node getTree1() {
        Node node1 = new Node(10);
        Node node2 = new Node(11);
        Node node3 = new Node(1);
        Node node4 = new Node(20);
        Node node5 = new Node(60);
        Node node6 = new Node(30);

        node1.setLeft(node2);
        node1.setRight(node3);
        node2.setLeft(node4);
        node2.setRight(node5);
        node3.setLeft(node6);

        return node1;
    }

    public static Node getTree2() {
        Node node1 = new Node(10);
        Node node2 = new Node(11);
        Node node3 = new Node(1);
        Node node4 = new Node(20);
        Node node5 = new Node(30);
        Node node6 = new Node(60);

        node1.setLeft(node2);
        node1.setRight(node3);
        node2.setLeft(node4);
        node2.setRight(node5);
        node3.setLeft(node6);

        return node1;
    }
}

