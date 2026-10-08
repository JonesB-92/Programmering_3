package searching;

public class LinearSearch {
    public static boolean contains(long target, long[] arr) {
        for (long num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }
}
