package opgave03;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Multiply implements Expression {
    private Expression left;
    private Expression right;
    //You mentioned earlier the idea of an intermediate abstract class for binary operations. Look at Add,
    // Subtract, Multiply, and Divide — they are identical except for one line each.
    //Could a BinaryExpression abstract class with left and right fields reduce that duplication?
    public Multiply(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double evaluate() {
        return left.evaluate() * right.evaluate();
    }

    @Override
    public String toString() {
        return "(" + left + " * " + right + ")";
    }

    @Override
    public Iterator<Expression> iterator() {
        return new LinkedList<>(List.of(left, right)).iterator();
    }
}
