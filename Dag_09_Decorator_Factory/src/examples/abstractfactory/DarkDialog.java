package examples.abstractfactory;

public class DarkDialog implements Dialog {
    @Override
    public void open() {
        System.out.println("[Dark] Aabner moerk dialog");
    }
}

