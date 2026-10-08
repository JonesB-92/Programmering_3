package examples.decoratorpatter;

public class Main {
    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();
        Coffee milkCoffee = new MilkDecorator(new SimpleCoffee());
        Coffee deluxeCoffee = new SugarDecorator(new MilkDecorator(new SimpleCoffee()));

        printCoffee("Simple coffee", simpleCoffee);
        printCoffee("Coffee with milk", milkCoffee);
        printCoffee("Coffee with milk and sugar", deluxeCoffee);
    }

    private static void printCoffee(String label, Coffee coffee) {
        System.out.println(label + ": " + coffee.getDescription() + " - " + coffee.getPrice() + " kr");
    }
}
