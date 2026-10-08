package examples.abstractfactory;

public class DarkButton implements Button {
    @Override
    public void render() {
        System.out.println("[Dark] Viser moerk knap");
    }
}

