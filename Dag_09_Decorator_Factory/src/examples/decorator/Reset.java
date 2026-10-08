package examples.decorator;

public class Reset extends PrintMessageDecorator {
    public Reset(Component decoratie) {
        super(decoratie);
    }

    @Override
    public void print() {
        System.out.println("\u001B[0m");
    }
}
