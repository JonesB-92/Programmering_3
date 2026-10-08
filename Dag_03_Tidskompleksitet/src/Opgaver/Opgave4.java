package Opgaver;

public class Opgave4 {
    /**
     * Opgave 4
     * Algoritme prefixAverage.
     * Du skal lave en metode der givet et array af heltal beregner prefix gennemsnittet af tallene i arrayet.
     * Prefix gennemsnittet af et array er et nyt array hvor indeks i indeholder gennemsnittet af tallene på indeksplads 0 til i
     * i det oprindelige array. Dette kan illustreres med nedenstående eksempel:
     * <p>
     * Givet arrayet: {5, 10, 5, 6, 4, 9, 8}
     * <p>
     * Er prefixarrayet: {5.0, 7.5, 6.667, 6.5, 6.0, 6.5, 6.714}
     * <p>
     * Metoden har følgende signatur:
     * <p>
     * public static double[] prefixAverage(int[] inputTal)
     * Programmer metoden så den får den mindst mulige tidskompleksitet.
     */

    public static double[] prefixAverage(int[] inputTal) {
        double[] prefixAvg = new double[inputTal.length];
        int sum = 0;
        for (int i = 0; i < inputTal.length; i++) {
            sum += inputTal[i];
            prefixAvg[i] = sum / (i + 1);
        }
        return null;
    }


}
