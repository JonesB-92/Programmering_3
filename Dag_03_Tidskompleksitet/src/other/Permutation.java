package other;

public class Permutation {
    /**
     * Generates and prints all permutations of the given string.
     * @param str the input string
     */
    public static void permute(String str) {
        permuteRecursive("", str);
    }

    /**
     * Recursive helper method to generate and print permutations
     * @param prefix the current prefix being built
     * @param remaining the remaining characters to permute
     */
    private static void permuteRecursive(String prefix, String remaining) {
        int n = remaining.length();

        // Base case: if no more characters to permute, print the permutation
        if (n == 0) {
            System.out.println(prefix);
        } else {
            // Recursive case: try each character as the next character in the permutation
            for (int i = 0; i < n; i++) {
                // Take character at position i and add it to prefix
                // Remove it from remaining and recursively permute
                permuteRecursive(
                    prefix + remaining.charAt(i),
                    remaining.substring(0, i) + remaining.substring(i + 1, n)
                );
            }
        }
    }
}
