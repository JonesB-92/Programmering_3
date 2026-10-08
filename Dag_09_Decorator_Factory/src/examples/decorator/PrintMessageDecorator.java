package examples.decorator;

public abstract class PrintMessageDecorator implements Component {

    protected Component decoratie;

    public PrintMessageDecorator(Component decoratie) {
        this.decoratie = decoratie;
    }
}
