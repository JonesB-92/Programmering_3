package opgave03;

public interface Expression extends Iterable<Expression> {
    double evaluate();

    String toString();
}
