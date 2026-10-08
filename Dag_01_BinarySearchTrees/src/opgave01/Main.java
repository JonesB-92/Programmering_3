package opgave01;

import com.sun.source.tree.Tree;
import com.sun.source.tree.TreeVisitor;
import examples.model.BinarySearchTree;
import examples.model.TreeNode;
import opgave01.model.BinarySearchTreeImpl;

import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public class  Main {
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
        BinarySearchTreeImpl<Integer> binarySearchTree = new BinarySearchTreeImpl<>(root);

        System.out.println("Indeholder det binære søgetræ 100? " + (binarySearchTree.search(100) ? "Ja" : "nej"));

        //Opgave 1
        System.out.println("OPGAVE 1---------------");
        binarySearchTree.inorder();
        System.out.println("OPGAVE 1.1---------------");
            //Opgave 1.1
        binarySearchTree.inorder(node -> System.out.println(node.getElement()));
            // et andet eksempel
        System.out.println("\nOPGAVE 1.1 med SUM ---------------");
        AtomicInteger sum = new AtomicInteger(0);
        binarySearchTree.inorder(node -> sum.addAndGet(node.getElement()));
            // or: bst.inorder(node -> sum.getAndAdd(node.getElement()));
        System.out.println(sum.get());
        // binarySearchTree.inorder(t -> System.out.println(t.getElement() + " "));
        // binarySearchTree.inorder(t -> t.setElement(t.getElement() + 10));
        // binarySearchTree.inorder(t -> System.out.println(t.getElement() + " "));

        //Opgave 2
        System.out.println("OPGAVE 2 Preorder ---------------");
        binarySearchTree.preorder();

        //Opgave 3
        System.out.println("\nOPGAVE 3 ---------------");
        System.out.println(binarySearchTree.minimumElement());
        System.out.println("\nOPGAVE 3 med rekursion ---------------");
        System.out.println(binarySearchTree.minimumElementRek());

        //Opgave 4
        System.out.println("\nOPGAVE 4 ---------------");
        System.out.println(binarySearchTree.maximumElement());
        System.out.println("\nOPGAVE 4 med rekursion ---------------");
        System.out.println(binarySearchTree.maximumElementRek());

        //Opgave 5
        System.out.println("\nOPGAVE 5 ---------------");
        System.out.println("Height: " + binarySearchTree.height());

        //Opgave 6
        System.out.println("\nOPGAVE 6 ---------------");
        System.out.println("LeafCount: " + binarySearchTree.leafCount());

        //Opgave 7
        System.out.println("\nOPGAVE 7 ---------------");
        System.out.println("inorderList " + binarySearchTree.inorderList());

        //Opgave 8.1
        System.out.println("\nOPGAVE 8.1 ---------------");
        System.out.println("removeMin: " + binarySearchTree.removeMin());
        binarySearchTree.inorder();
        binarySearchTree.add(45);

        //Opgave 8.2
        System.out.println("\nOPGAVE 8.2 ---------------");
        System.out.println("removeMax: " + binarySearchTree.removeMax());
        binarySearchTree.inorder();
        binarySearchTree.add(107);

        //Opgave 8.3
        System.out.println("\nOPGAVE 8.3 ---------------");
        System.out.println("greaterThanCount: " + binarySearchTree.greaterThanCount(59));
        System.out.println("greaterThanCount: " + binarySearchTree.greaterThanCount(60));
        System.out.println("greaterThanCount: " + binarySearchTree.greaterThanCount(107));
        System.out.println("greaterThanCount: " + binarySearchTree.greaterThanCount(45));
        System.out.println("greaterThanCount: " + binarySearchTree.greaterThanCount(44));

        //Opgave 8.4
        System.out.println("\nOPGAVE 8.4 ---------------");
        System.out.println("greaterThanList 45: " + binarySearchTree.greaterThanList(45));
        System.out.println("greaterThanList 44: " + binarySearchTree.greaterThanList(44));
        System.out.println("greaterThanList 60: " + binarySearchTree.greaterThanList(60));
        System.out.println("greaterThanList 107: " + binarySearchTree.greaterThanList(107));

    }
}

