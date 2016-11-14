package net.ohmz.algorithms.practice.self.trees;

public class BinarySearchTree {
    private Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public Node getRoot() {
        return this.root;
    }

    public boolean find(int value) {
        Node current = root;
        while (current != null) {
            if (current.getValue() == value) {
                return true;
            } else if (current.getValue() > value) {
                current = current.getLeft();
            } else if (current.getValue() < value) {
                current = current.getRight();
            }
        }
        return false;
    }

    public boolean findRecursive(int value) {
        return findRecursive(value, root);
    }

    private boolean findRecursive(int value, Node node) {
        if (node == null) {
            return false;
        }

        if (node.getValue() == value) {
            return true;
        }

        if (node.getValue() > value) {
            return findRecursive(value, node.getLeft());
        }

        if (node.getValue() < value) {
            return findRecursive(value, node.getRight());
        }

        // This will never happen
        return false;
    }

    public boolean delete(int value) {
        Node parent = root;
        Node current = root;

        // Find the node
        boolean isLeftChild = false;
        while (current.getValue() != value) {
            parent = current;
            if (current.getValue() > value) {
                isLeftChild = true;
                current = current.getLeft();
            } else {
                isLeftChild = false;
                current = current.getRight();
            }

            if (current  == null) {
                return false;
            }
        }

        // found it.

        // if node to be deleted has no children:
        if (current.getLeft() == null && current.getRight() == null) {
            if (current == root) {
                root = null;
            }

            if (isLeftChild) {
                parent.setLeft(null);
            } else {
                parent.setRight(null);
            }
        } else if (current.getRight() == null) { // Only one child (Left)
            if (current == root) {
                root = current.getLeft();
            } else if (isLeftChild) {
                parent.setLeft(current.getLeft());
            } else {
                parent.setRight(current.getLeft());
            }
        } else if (current.getLeft() == null) { // Only one child (Right)
            if (current == root) {
                root = current.getRight();
            } else if (isLeftChild) {
                parent.setLeft(current.getRight());
            } else {
                parent.setRight(current.getRight());
            }
        } else if (current.getLeft() != null && current.getRight() != null) { // is this clause redundant?
            Node successor = getSuccessor(current);

            if (current == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.setLeft(successor);
            } else {
                parent.setRight(successor);
            }

            successor.setLeft(current.getLeft());
        }

        return true;
    }

    private Node getSuccessor(Node nodeToDelete) {
        Node successor = null;
        Node successorParent = null;
        Node current = nodeToDelete.getRight();

        while (current != null) {
            successorParent = successor;
            successor = current;
            current = current.getLeft();
        }

        if (successor != nodeToDelete.getRight()) {
            successorParent.setLeft(successor.getRight());
            successor.setRight(nodeToDelete.getRight());
        }
        return successor;
    }

    public void insert(int value) {
        Node newNode = new Node(value);

        if (root == null) {
            root = newNode;
            return;
        }

        Node current = root;
        Node parent = null;
        while (true) {
            parent = current;

            if (value < current.getValue()) {
                current = current.getLeft();
                if (current == null) {
                    parent.setLeft(newNode);
                    return;
                }
            } else {
                current = current.getRight();
                if (current == null) {
                    parent.setRight(newNode);
                    return;
                }
            }
        }


    }

    public void display(Node node) {
        if (node != null) {
            display(node.getLeft());
            System.out.print(" " + node.getValue());
            display(node.getRight());
        }
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(3);
        tree.insert(8);
        tree.insert(1);
        tree.insert(4);
        tree.insert(6);
        tree.insert(2);
        tree.insert(10);
        tree.insert(20);
        tree.insert(25);
        tree.insert(15);
        tree.insert(16);
        System.out.println("Original Tree:");
        tree.display(tree.getRoot());

        tree.getRoot().print();

        System.out.println("");
        System.out.println("Find 4: " + tree.find(4));
        System.out.println("Find 4 Recursive: "+ tree.findRecursive(4));

        System.out.println("Find 5: " + tree.find(5));
        System.out.println("Find 5 Recursive: "+ tree.findRecursive(5));

    }

}
