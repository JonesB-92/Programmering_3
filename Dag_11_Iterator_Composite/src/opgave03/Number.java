package opgave03;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Number implements Expression {
    private double value;

    public Number(double value) {
        this.value = value;
    }

    @Override
    public double evaluate() {
        return value;
    }

    @Override
    public String toString() {
        return "" + evaluate();
    }

    @Override
    public Iterator<Expression> iterator() {
        /** Good question! A few reasons:

         -No object allocation — new LinkedList<Expression>() creates a LinkedList object just to immediately
         throw it away. Collections.emptyIterator() returns a lightweight singleton with no wasted allocation.
         -Intent is clearer — emptyIterator() immediately signals "this returns nothing", whereas the LinkedList
         version makes you think for a second before realizing it's empty.
         -No generics headache — as you just experienced, the compiler needs help with new LinkedList<Expression>().
         Collections.emptyIterator() infers the type cleanly from the return type.
         */
        return Collections.emptyIterator();
    }
}
