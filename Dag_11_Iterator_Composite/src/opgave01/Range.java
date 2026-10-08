package opgave01;

import java.util.Iterator;

public class Range implements Iterable<Integer> {
    /**
     Opgave 1: Implementering af Iterator i Range
     Range repræsenterer et interval af heltal (fra start til end inklusiv).

     Klassen implementerer Iterable<Integer>, men metoden iterator() returnerer i øjeblikket null.

     Din opgave:
     Implementer en iterator til Range klassen.
     Du kan vælge at implementere iteratoren som en privat indre klasse i Range.
     Iteratoren skal kunne gennemløbe alle tal i intervallet fra start til og med end.
     Efter implementeringen skal du kunne køre Main klassen i opgave01 og se tallene fra -3 til 10 blive udskrevet.
     */

    private final int start;
    private final int end;

    public Range(int start, int end) {
        if (start > end) {
            throw new IllegalArgumentException("End must be greater than start");
        }
        this.start = start;
        this.end = end;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RangeIterator(start, end);
    }
}
