package examples.decoratorpatter;

public abstract class CoffeeDecorator implements Coffee {
    private final Coffee coffee;

    protected CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    protected Coffee getCoffee() {
        return coffee;
    }
}

