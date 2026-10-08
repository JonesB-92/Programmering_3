package opgave03;

public class Main3 {
    public static void main(String[] args) {
        // (2 + 3) * 5
        Expression e2 = new Number(2);
        Expression e3 = new Number(3);
        Expression e5 = new Number(5);

        Expression expression = new Multiply(new Add(e2, e3), e5);

        System.out.println(expression + " = " + expression.evaluate());

        // ... demonstrere dette i Main ved at beregne et komplekst udtryk som f.eks. -(10 - 2) / 2.
        // 10
        Expression e10 = new Number(10);
        //Expression e2 = new Number(2);

        //(10 - 2)
        Expression eSub = new Subtract(e10, e2);

        // -(10 - 2) / 2.
        Expression expression1 = new Divide(new Negate(new Subtract(e10, e2)), e2);

        System.out.println(expression1 + " = " + expression1.evaluate());

        System.out.println("\n ELLER:");
        Expression eNeg = new Negate(eSub);
        Expression expression2 = new Divide(eNeg, e2);
        System.out.println(expression2 + " = " + expression2.evaluate());

        System.out.println("----------------------\n");


        for (Expression e : e2) {
            System.out.println(e);
        }

        System.out.println();

        for (Expression expression3 : expression2) {
            System.out.println(expression3);
        }

        DeepIterator it = new DeepIterator(expression2);
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
