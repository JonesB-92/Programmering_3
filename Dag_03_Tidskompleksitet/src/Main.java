import com.google.common.base.Stopwatch;
import generator.RandomNumbersGenerator;
import searching.LinearSearch;

import java.util.concurrent.TimeUnit;

public class Main {
    private static final int NUMBER = 100_000;

    public static void main(String[] args) {

        long[] numbers = RandomNumbersGenerator.generate(NUMBER);
        Stopwatch stopwatch = Stopwatch.createStarted();
        //SumNumbers.sum(numbers);
        //BinarySearch.contains(105734, numbers);
        LinearSearch.contains(105734, numbers);
        //BubbleSort.bubbleSort(numbers);
        //QuickSort.quickSort(numbers);
        System.out.println();
        //System.out.println("Fibbonacci.fibonacci(10) = " + Fibbonacci.fibonacci(10));
        //Permutation.permute("Hello World");
        stopwatch.stop();
        long durationMillis = stopwatch.elapsed(TimeUnit.MILLISECONDS);
        System.out.println("Antal tal: " + NUMBER + " udførselstid: " + durationMillis + " ms.");

        Nedboer nedboer = new Nedboer();
        System.out.println(nedboer.getNedboerPrUge());
    }

}
