package Eksempler.adaptor;

public class Main {
    public static void main(String[] args) {
        Projector projector = new LGAdaptor(new LGProjector());
        projector.turnOn();
    }

}

