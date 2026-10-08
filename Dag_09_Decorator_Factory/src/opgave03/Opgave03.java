package opgave03;

import opgave03.primenumbers.PrimeNumberFinder;
import opgave03.primenumbers.SieveOfEratosthenes;
import opgave03.primenumbers.TimingDecorator;

public class Opgave03 {
    public static void main(String[] args) {

        PrimeNumberFinder finder = new TimingDecorator(new SieveOfEratosthenes());
        finder.findPrimeNumbers(100);
    }
}
