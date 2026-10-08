package opgave02;

public class Whip extends CondimentDecorator{
    private double price = 0.10;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return getBeverage().cost() + price;
    }


    @Override
    public String getDescription() {
        return getBeverage().getDescription() + ", Whip";
    }

}
