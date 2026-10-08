package addition;

import java.util.Arrays;

public class SumNumbers {
    public static long sum(long[] arr) {
        return Arrays.stream(arr).sum();
    }
}
