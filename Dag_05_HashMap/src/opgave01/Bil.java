package opgave01;

import java.util.Objects;

/**
 * Lav en Bil klasse med attributterne
 * registreringsnummer
 * mærke
 * model
 * farve (og constructor, toString samt get/set metoder).
 */
public class Bil {
    private String nummerplade;
    private String mærke;
    private String model;
    private String farve;

    public Bil(String nummerplade, String mærke, String model, String farve) {
        this.nummerplade = nummerplade;
        this.mærke = mærke;
        this.model = model;
        this.farve = farve;
    }


    /**
     * To biler skal opfattes som værende det samme objekt, hvis de har samme registreringsnummer og mærke.
     * Lav de ændringer der skal til, for at sådanne to biler opfattes som ens.
     * Det betyder, at der kun skal kunne være en bil med samme registreringsnummer og mærke i det samme HashSet.
     * Prøv det af ved at indsætte objekter i HashSet.
     */
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Bil bil = (Bil) o;
        return Objects.equals(nummerplade, bil.nummerplade) && Objects.equals(mærke, bil.mærke);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nummerplade, mærke);
    }


    @Override
    public String toString() {
        return "Bil{" +
                "nummerplade='" + nummerplade + '\'' +
                ", mærke='" + mærke + '\'' +
                ", model='" + model + '\'' +
                ", farve='" + farve + '\'' +
                '}';
    }
}
