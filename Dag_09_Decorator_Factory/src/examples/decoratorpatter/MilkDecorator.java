package examples.decoratorpatter;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return getCoffee().getDescription() + ", milk";
    }

    @Override
    public int getPrice() {
        return getCoffee().getPrice() + 5;
    }
}

