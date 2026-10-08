package examples.decorator;

public class WithGreenFont extends PrintMessageDecorator{
    public WithGreenFont(Component decoratie) {
        super(decoratie);
    }

    @Override
    public void print() {
        System.out.println("\u001B[32m");
        super.decoratie.print();
    }
}
