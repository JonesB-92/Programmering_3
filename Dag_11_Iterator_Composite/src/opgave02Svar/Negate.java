package opgave02Svar;

public class Negate implements Expression{
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
}
