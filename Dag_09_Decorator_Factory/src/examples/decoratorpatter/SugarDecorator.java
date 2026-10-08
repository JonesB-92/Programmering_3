package examples.decoratorpatter;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return getCoffee().getDescription() + ", sugar";
    }

    @Override
    public int getPrice() {
        return getCoffee().getPrice() + 2;
    }
}

