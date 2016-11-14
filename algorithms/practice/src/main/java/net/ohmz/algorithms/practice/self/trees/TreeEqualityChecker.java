package net.ohmz.algorithms.practice.self.trees;

public class TreeEqualityChecker {

    public boolean checkEqual(Node tree1, Node tree2) {
        if (tree1 == null && tree2 == null) {
            return true;
        } else {
            if (tree1 != null && tree2 != null && tree1.getValue() == tree2.getValue()) {
                return checkEqual(tree1.getLeft(), tree2.getLeft()) &&
                        checkEqual(tree1.getRight(), tree2.getRight());
            } else {
                return false; // one of them is null and the other isn't.
            }
        }
    }

    public static void main(String[] args){
        TreeEqualityChecker checker = new TreeEqualityChecker();

        Node tree1 = SampleTrees.getTree1();
        Node tree2 = SampleTrees.getTree1();
        System.out.println(checker.checkEqual(tree1, tree2));

        Node tree3 = SampleTrees.getTree1();
        Node tree4 = SampleTrees.getTree2();
        System.out.println(checker.checkEqual(tree3,tree4));

    }
}

