package examples.decoratorpatter;

public class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Coffee";
    }

    @Override
    public int getPrice() {
        return 25;
    }
}

