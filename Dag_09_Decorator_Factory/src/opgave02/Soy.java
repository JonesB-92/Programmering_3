package opgave02;

public class Soy extends CondimentDecorator {
    private double price = 0.15;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return getBeverage().cost() + price;
    }

    @Override
    public String getDescription() {
        return getBeverage().getDescription() + ", Soyboy";
    }

}
