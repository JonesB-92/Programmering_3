package opgave01.model;

import examples.model.BinarySearchTree;
import examples.model.Tree;
import examples.model.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class BinarySearchTreeImpl<E extends Comparable<E>> extends BinarySearchTree<E> {

    public BinarySearchTreeImpl(TreeNode<E> root) {
        super(root);
    }

    public BinarySearchTreeImpl() {
        super();
    }

    /**
     * Opgave 3
     * Tilføj en metode minimumElement(), der returnerer det mindste element i træet.
     */
    public E minimumElement() {
        if (root == null) {
            throw new NoSuchElementException();
        }
        // Mindste element altid sidste left child i venstre side
        TreeNode<E> current = root;
        while (current.getLeft() != null) {
            current = current.getLeft();
        }
        return current.getElement();
    }


    //Opgave 3 rekursivt
    public E minimumElementRek() {
        return minimumElementRek(root);
    }

    private E minimumElementRek(TreeNode<E> current) {
        if (current == null) {
            throw new NoSuchElementException();
        }

        if (current.getLeft() == null) {
            return current.getElement();
        } else {
            return minimumElementRek(current.getLeft());
        }
    }

    /**
     * Opgave 4
     * Tilføj en metode maximumElement(), der returnerer det største element i træet.
     */
    public E maximumElement() {
        if (root == null) {
            throw new NoSuchElementException();
        }

        TreeNode<E> current = root;
        while (current.getRight() != null) {
            current = current.getRight();
        }
        return current.getElement();

    }

    //Rekursion
    public E maximumElementRek() {
        return maximumElementRek(root);
    }

    private E maximumElementRek(TreeNode<E> current) {
        if (current == null) {
            throw new NoSuchElementException();
        }

        if (current.getRight() == null) {
            return current.getElement();
        } else {
            return maximumElementRek(current.getRight());
        }
    }


    /**
     * Opgave 5
     * Lav en metode height(), der returnerer højden af træet.
     * <p>
     * The height of a nonempty tree is the length of the path from the root
     * node to its furthest leaf. The height of a tree that contains a single node is 0. Conventionally,
     * the height of an empty tree is −1.
     * (The length of a path is the number of the edges in the path. The depth of a node is the  length of the
     * path from the root to the node)
     */
    //Højde = root til sidste leaf i træ
    public int height() {
        return height(root);
    }

    private int height(TreeNode<E> current) {
        if (current == null) {
            return -1;
        }

        int left = height(current.getLeft());
        int right = height(current.getRight());

        return (left > right ? left : right) + 1;
    }


    /**
     * Opgave 6
     * Lav en metode leafCount() der returnerer antallet af blade i træet.
     */
    public int leafCount() {
        return leafCount(root);
    }

    private int leafCount(TreeNode<E> current) {
        if (current == null) {
            return 0;
        }

        if (current.getLeft() == null && current.getRight() == null) {
            return 1;
        }

        return leafCount(current.getLeft()) + leafCount(current.getRight());
    }

    /**
     * Opgave 7
     * Lav en metode inorderList, der returnerer en Liste med alle elementerne i træet i inorder rækkefølge, dvs. sorteret.
     */
    public List<E> inorderList() {
        List<E> result = new ArrayList<>();
        inorderList(root, result);
        return result;
    }

    private void inorderList(TreeNode<E> current, List<E> list) {
        // Inorder ––> L -> N -> R
        if (current == null) {
            return;
        }
        inorderList(current.getLeft(), list);
        list.add(current.getElement());
        inorderList(current.getRight(), list);
    }

    /**
     * Opgave 8:
     * Implementer følgende metoder:
     *
     * Opgave 8.1
     * E removeMin(); // Fjerner det mindste element i træet og returnerer
     */
    public E removeMin() {
        if (root == null) {
            throw new IllegalArgumentException();
        }

        TreeNode<E> parent = null;
        TreeNode<E> current = root;

        while (current.getLeft() != null) {
            parent = current;
            current = current.getLeft();
        }

        parent.setLeft(current.getRight());

        return current.getElement();
    }

    /**
     * Opgave 8.2
     * E removeMax(); // Fjerner det største element i træet og returnerer
     */
    public E removeMax() {
        if (root == null) {
            throw new IllegalArgumentException();
        }

        TreeNode<E> parent = null;
        TreeNode<E> current = root;

        while (current.getRight() != null) {
            parent = current;
            current = current.getRight();
        }
        parent.setRight(current.getLeft());

        return current.getElement();
    }

    /**
     * Opgave 8.3
     * // Returnerer antallet af elementer i træet, der er større end det givne element
     * int greaterThanCount(E element);
     */
    public int greaterThanCount(E element) {
        return greaterThanCount(element, root);
    }

    private int greaterThanCount(E element, TreeNode<E> current) {
        if (current == null) {
            return 0;
        }

        if (current.getElement().compareTo(element) > 0) {
            return 1 + (greaterThanCount(element, current.getLeft()) + greaterThanCount(element, current.getRight()));
        } else if (current.getElement().compareTo(element) == 0) {
            return greaterThanCount(element, current.getRight());
        } else {
            return 0;
        }
    }

    /**
     * Opgave 8.4
     * List<E> greaterThan(E element);
     * // Returnerer en liste over alle elementer i træet, der er større end det givne element
     */
    public List<E> greaterThanList(E element) {
        List<E> list = new ArrayList<>();
        greaterThanList(element, root, list);
        return list;
    }

    // Returnerer en liste over alle elementer i træet, der er større end det givne element
    private void greaterThanList(E element, TreeNode<E> current, List<E> list) {
        if (current == null) {
            return;
        }
        if (current.getElement().compareTo(element) > 0) {
            greaterThanList(element, current.getLeft(), list);
            list.add(current.getElement());
            greaterThanList(element, current.getRight(), list);
        } else {
            greaterThanList(element, current.getRight(), list);
        }
    }
/** ------------------------------------------------------------------------------- */

// ORDER opgaver

    /**
     * Opgave 2
     * Implementer en preorder metode, der gennemløber alle knuderne i træet i preorder rækkefølge
     * og udskriver elementerne til konsollen.
     */
    public void preorder() {
        preorder(super.root);
    }

    private void preorder(TreeNode<E> current) {
        // N --> L --> R
        if (current == null) {
            return;
        }
        //N
        System.out.println(current.getElement() + "");
        //L
        preorder(current.getLeft());
        preorder(current.getRight());
    }

    public void inorder() {
        inorder(super.root);
    }

    /**
     * Opgave 1
     * //Implementer metoden inorder(TreeNode<E> current) i BinarySearchTreeImpl klassen.
     * //Den skal lave et gennemløb af træet og udskrive elementet af hver knude i inorder rækkefølge
     */
// TODO
    private void inorder(TreeNode<E> current) {
        // Inorder ––> L -> N -> R
        //Termineringsregel
        if (current == null) {
            return;
        }
        // Rekurrensregel (while current != null)
        // L
        inorder(current.getLeft());
        // N
        System.out.println(current.getElement() + "");
        // R
        inorder(current.getRight());
    }

    /**
     * Ekstra opgave 1.1
     * Tilføj en ekstra parameter til inorder(Consumer<TreeNode<E>> consumer) metoden.
     * Consumer er et funktionelt interface med metoden void accept(T t), så man kan kalde inorder() metoden med et lambda udtryk.
     */
    public void inorder(Consumer<TreeNode<E>> c) {
        inorder(c, super.root);
    }

    private void inorder(Consumer<TreeNode<E>> consumer, TreeNode<E> current) {
        if (current == null) {
            return;
        }

        inorder(consumer, current.getLeft());
        consumer.accept(current); //This is where control temporarily leaves the tree and enters the caller’s code.
        inorder(consumer, current.getRight());

    }
/**
 Chat:
 A Consumer<T> is something that takes a T and returns nothing.

 Think: “Here’s a value — do something with it.”

 2️⃣ Why use a Consumer in a tree traversal?

 Before, your inorder traversal was hard-coded:

 System.out.println(current.getElement());


 Now you’ve generalized it:

 consumer.accept(current);


 This means:

 “I don’t care what you do with the node — you decide.”

 That’s separation of concerns:

 Tree handles traversal - Caller decides what to do at each node */

}
