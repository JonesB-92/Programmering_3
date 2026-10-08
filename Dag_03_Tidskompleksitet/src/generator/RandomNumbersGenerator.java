package generator;

import java.util.Arrays;
import java.util.Random;

public class RandomNumbersGenerator {
    private static Random random = new Random();

    public static long[] generate(int number) {
        long[] result = new long[number];

        for (int i = 0; i < number; i++) {
            result[i] = random.nextLong();
        }
        return result;
    }

    public static double[] generateSorted(int number) {
        double[] result = new double[number];
        for (int i = 0; i < number; i++) {
            result[i] = random.nextDouble();
        }
        Arrays.sort(result);
        return result;
    }
}
