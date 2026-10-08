package examples.iterator;

import java.util.Iterator;

public class MyArray<T> implements Iterable<T>{
    protected int capasity = 10;
    private Object[] internalArray = new Object[capasity];

    public void add(int index, T element) {
        checkIndexBoudaries(index);
        internalArray[index] = element;
    }

    public T get(int index) {
        checkIndexBoudaries(index);
        return (T)internalArray[index];
    }

    private void checkIndexBoudaries(int index) {
        if (index < 0 || index > capasity - 1) {
            throw new IndexOutOfBoundsException("index is out of range");
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new MyArrayIterator<>(this);
    }
}
