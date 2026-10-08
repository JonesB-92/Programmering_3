package opgave02Svar;

public class Divide implements Expression{
    private Expression left;
    private Expression right;

    public Divide(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public double evaluate() {
        return left.evaluate() / right.evaluate();
    }

    @Override
    public String toString() {
        return "(" + left + " / " + right + ")";    }
}
