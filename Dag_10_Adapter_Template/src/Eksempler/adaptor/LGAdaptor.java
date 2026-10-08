package Eksempler.adaptor;

public class LGAdaptor implements Projector {
    private LGProjector projector;

    public LGAdaptor(LGProjector projector) {
        this.projector = projector;
    }

    @Override
    public void turnOn() {
        projector.start(100);
    }
}
