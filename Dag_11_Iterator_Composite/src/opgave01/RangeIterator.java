package opgave01;

import com.sun.source.tree.WhileLoopTree;

import java.util.Iterator;

public class RangeIterator implements Iterator<Integer> {
    private int currentNum;
    private int end;

    public RangeIterator(int start, int end) {
        this.end = end;
        currentNum = start;
    }

    @Override
    public boolean hasNext() {
        return currentNum <= end;
    }

    @Override
    public Integer next() {
        return currentNum++;
    }
}
