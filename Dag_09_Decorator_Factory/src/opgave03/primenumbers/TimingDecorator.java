package opgave03.primenumbers;

import java.time.Duration;
import java.time.Instant;

public class TimingDecorator implements PrimeNumberFinder {
    private PrimeNumberFinder wrapped;

    public TimingDecorator(PrimeNumberFinder wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public void findPrimeNumbers(int n) {
        Instant start = Instant.now();
        wrapped.findPrimeNumbers(n); // delegate to the real thing
        Instant finish = Instant.now();
        System.out.println(Duration.between(start, finish).toMillis() + " ms.");
    }
}
