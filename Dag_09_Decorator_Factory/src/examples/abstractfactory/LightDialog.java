package examples.abstractfactory;

public class LightDialog implements Dialog {
    @Override
    public void open() {
        System.out.println("[Light] Aabner lys dialog");
    }
}

