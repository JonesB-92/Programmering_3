package searching;

public class BinarySearch {
    public static boolean contains(long target, long[] candidates) {
        int left = 0;
        int right = candidates.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long midValue = candidates[mid];

            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}
