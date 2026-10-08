package examples.model;

import java.util.Collection;

public interface Tree<E extends Comparable<E>> extends Collection<E> {
    boolean search(E element);
}
