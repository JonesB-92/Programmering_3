package opgave03;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Add implements Expression {
    private Expression left;
    private Expression right;

    public Add(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double evaluate() {
        return left.evaluate() + right.evaluate();
    }

    @Override
    public String toString() {
        return "(" + left + " + " + right + ")";
    }

    @Override
    public Iterator<Expression> iterator() {
        return new LinkedList<>(List.of(left, right)).iterator();
    }
}
