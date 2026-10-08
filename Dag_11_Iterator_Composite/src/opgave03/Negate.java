package opgave03;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Negate implements Expression {
    private Expression expression;


    public Negate(Expression expression) {
        this.expression = expression;

    }

    @Override
    public double evaluate() {
        return -(expression.evaluate());
    }

    @Override
    public String toString() {
        return "-" + expression;
    }

    @Override
    public Iterator<Expression> iterator() {
        return new LinkedList<>(List.of(expression)).iterator();
    }
}
