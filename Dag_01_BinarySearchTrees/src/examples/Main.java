package examples;

import examples.model.TreeNode;

public class Main {
    public static void main(String[] args) {
        TreeNode<Integer> root = new TreeNode<>(60);
        TreeNode<Integer> left = new TreeNode<>(55);
        root.setLeft(left);
        TreeNode<Integer> right = new TreeNode<>(100);
        root.setRight(right);
        left.setLeft(new TreeNode<>(45));
        left.setRight(new TreeNode<>(57));
        right.setLeft(new TreeNode<>(67));
        right.setRight(new TreeNode<>(107));

    }
}

