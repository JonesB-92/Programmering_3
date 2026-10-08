package opgave02;

public abstract class  CondimentDecorator extends Beverage{
    Beverage beverage;

    public Beverage getBeverage() {
        return beverage;
    }

    public abstract String getDescription();

}
