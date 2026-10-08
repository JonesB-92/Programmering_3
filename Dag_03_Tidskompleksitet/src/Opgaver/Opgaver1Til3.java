package Opgaver;

public class Opgaver1Til3 {
    // Hvad er størrelsesordenen af tidskompleksiteten (Store O) af nedenstående metode?
    // O(n^2)
    public void algorithm(int[] array) {
        for (int pass = 1; pass <= array.length; pass++) { //--> giver out of bounds
            for (int index = 0; index < array.length; index++) {
                for (int count = 0; count < 10; count++) {
                    // Koden her er uafhængig af arryets størrelse
                }
            }
        }
    }
    //Hvad er størrelsesordenen af ovenstående metode, hvis tallet 10 erstattes af array.length i den inderste løkke?
    // O(n^3)


    /**
     * Opgave 2
     * Hvad er størrelsesordenen af tidskompleksiteten (Store O) af nedenstående metoder?
     */
    // O(1) --> Constant
    public boolean isStringHello(String string) {
        if (string.equals("Hello")) {
            return true;
        }
        return false;
    }

    // O(n * m)
    public boolean checkString(String[] strings, String text) {
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] == text) {
                return true;
            }
        }
        return false;
    }

    // O(n^2)
    public void methodA(int[] array, int n) {
        for (int index = 0; index < n - 1; index++) {
            int mark = privatemethodA(array, index, n - 1);
            int temp = array[index];
            array[index] = array[mark];
            array[mark] = temp;
        }
    }
    private int privatemethodA(int[] array, int first, int last) {
        int min = array[first];
        int indexOfMin = first;
        for (int index = first + 1; index <= last; index++) {
            if (array[index] < min) {
                min = array[index];
                indexOfMin = index;
            }
        }
        return indexOfMin;
    }

    //inner loop --> O(n)
    //outer --> O(logn)
    // --> O(n * logn)
    public int methodB(int n) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j = j * 2) {
                result++;
            }
        }
        return result;
    }

    //Opgave 3
    //Hvad er worst case tidskompleksitet ved søgning i et binært søgetræ med n noder?
    // --> O(n)

    //Hvad er worst case tidskompleksitet ved søgning i et binært søgetræ med n noder, hvis træet er perfekt balanceret?
    //Et perfekt balanceret binært søgetræ er et træ, hvor alle indre noder har to børn, og alle bladnoder er på samme niveau.
    // --> O(logn) – height() er log(n), og worstcase skal vi helt ned i bunden





}
