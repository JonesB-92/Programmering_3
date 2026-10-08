package examples.abstractfactory;

public class LightButton implements Button {
    @Override
    public void render() {
        System.out.println("[Light] Viser lys knap");
    }
}

