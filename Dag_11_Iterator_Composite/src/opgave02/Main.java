package opgave02;

public class Main {
    public static void main(String[] args) {
        // (2 + 3) * 5
        Expression e2 = new Expression(2);
        Expression e3 = new Expression(3);
        Expression e5 = new Expression(5);

        Expression expression = new Expression(Type.MUL, new Expression(Type.ADD, e2, e3), e5);

        System.out.println(expression + " = " + expression.evaluate());
    }
}
