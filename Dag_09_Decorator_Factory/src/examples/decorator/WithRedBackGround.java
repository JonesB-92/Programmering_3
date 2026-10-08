package examples.decorator;

public class WithRedBackGround extends PrintMessageDecorator{
    public WithRedBackGround(Component decoratie) {
        super(decoratie);
    }

    @Override
    public void print() {
        System.out.println("\u001B[41m");
        super.decoratie.print();
    }
}
