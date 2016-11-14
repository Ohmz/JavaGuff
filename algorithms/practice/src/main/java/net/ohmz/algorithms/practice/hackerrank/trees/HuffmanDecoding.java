package net.ohmz.algorithms.practice.hackerrank.trees;

public class HuffmanDecoding {

    void decode(String S ,Node root)
    {
        Node current = root;
        for (int i = 0; i < S.length() ; i++) {
            current = S.charAt(i) == '0'? current.left : current.right;
            if (current.left == null && current.right == null) {
                System.out.print(current.data);
                current = root;
            }
        }

    }

}
