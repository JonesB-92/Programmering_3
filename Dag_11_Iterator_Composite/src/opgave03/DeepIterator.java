package opgave03;


import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

public class DeepIterator implements Iterator<Expression> {
    private Stack<Expression> stack = new Stack<>();

    public DeepIterator(Expression root) {
        if (root != null) {
            stack.push(root);
        }
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public Expression next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }

        Expression current = stack.pop();

        // Her skal logikken til at tilføje børn til stacken implementeres
        for (Expression ex : current) {
            stack.push(ex);
        }

        // Tip: Da dette er en generel iterator for Expression, 
        // skal man overveje hvordan man får fat i venstre/højre barn
        // uden at bryde indkapslingen for meget.

        return current;
    }
}
