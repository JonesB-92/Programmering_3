package examples.model;

import java.util.Collection;
import java.util.Iterator;

public abstract class BinarySearchTree<E extends Comparable<E>> implements Tree<E> {
    protected int size = 0;
    protected TreeNode<E> root;

    public BinarySearchTree(TreeNode<E> root) {
        this.root = root;
    }

    public BinarySearchTree() {
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public boolean contains(Object object) {
        return search((E)object);
    }

    @Override
    public boolean search(E element) {
        TreeNode<E> current = root;
        while (current != null) {
            if (element.compareTo(current.getElement()) < 0) {
                current = current.getLeft();
            } else if (element.compareTo(current.getElement()) > 0) {
                current = current.getRight();
            } else {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public boolean add(E element) {
        if (root == null) {
            root = new TreeNode<>(element);
            size++;
            return true;
        }
        TreeNode<E> current = root;
        TreeNode<E> parent = null;
        while (current != null) {
            if (element.compareTo(current.getElement()) < 0) {
                parent = current;
                current = current.getLeft();
            } else if (element.compareTo(current.getElement()) > 0) {
                parent = current;
                current = current.getRight();
            } else {
                return false; //duplicate element
            }
        }
        if (element.compareTo(parent.getElement()) < 0 ) {
            parent.setLeft(new TreeNode<>(element));
        } else {
            parent.setRight(new TreeNode<>(element));
        }
        size++;
        return true;

    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        if (collection.size() == 0) {
            return false;
        }
        collection.forEach(this::add);
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public void clear() {
        root = null;
    }
}