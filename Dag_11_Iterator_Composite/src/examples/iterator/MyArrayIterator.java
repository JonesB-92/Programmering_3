package examples.iterator;

import java.util.Iterator;

public class MyArrayIterator<T> implements Iterator<T> {
    private int currentIndex = 0;
    private MyArray<T> myArray;

    public MyArrayIterator(MyArray<T> myArray) {
        this.myArray = myArray;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < myArray.capasity;
    }

    @Override
    public T next() {
        return myArray.get(currentIndex++);
    }
}
