package opgave02;

public class Expression {

    private final Type type;
    private double value; // Kun brugt hvis type er NUMBER
    private Expression left;
    private Expression right;

    public Expression(double value) {
        this.type = Type.NUMBER;
        this.value = value;
    }

    public Expression(Type type, Expression left, Expression right) {
        this.type = type;
        this.left = left;
        this.right = right;
    }

    public double evaluate() {
        switch (type) {
            case NUMBER:
                return value;
            case ADD:
                return left.evaluate() + right.evaluate();
            case MUL:
                return left.evaluate() * right.evaluate();
            default:
                throw new UnsupportedOperationException("Ukendt type: " + type);
        }
    }

    @Override
    public String toString() {
        switch (type) {
            case NUMBER:
                return String.valueOf(value);
            case ADD:
                return "(" + left + " + " + right + ")";
            case MUL:
                return "(" + left + " * " + right + ")";
            default:
                return "";
        }
    }
}
