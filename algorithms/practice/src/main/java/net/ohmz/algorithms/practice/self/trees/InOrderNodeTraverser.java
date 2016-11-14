package net.ohmz.algorithms.practice.self.trees;

public class InOrderNodeTraverser {

    public void traverse(Node node) {
        if (node == null) return;
        traverse(node.getLeft());
        System.out.println(node.getValue());
        traverse(node.getRight());
    }

    public static void main(String[] args){
        Node tree1 = SampleTrees.getTree1();
        Node tree2 = SampleTrees.getTree2();

        InOrderNodeTraverser traverser = new InOrderNodeTraverser();
        System.out.println("\nTraversing tree 1\n");
        traverser.traverse(tree1);
        System.out.println("\nTraversing tree 2\n");
        traverser.traverse(tree2);

    }
}
