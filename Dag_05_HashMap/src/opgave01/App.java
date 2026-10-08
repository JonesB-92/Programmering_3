package opgave01;

import java.util.HashSet;

public class App {
    public static void main(String[] args) {
        /**
         * Lav en App klasse med en main() metode.
         * Opret et HashSet og indsæt nogle Bil objekter i denne.
         * Lav flere biler med præcis de samme attributter.
         */

        // Opret biler
        Bil bil1 = new Bil("AB12345", "Toyota", "Corolla", "Rød");
        Bil bil2 = new Bil("CD67890", "BMW", "320i", "Sort");
        Bil bil3 = new Bil("EF11111", "Audi", "A4", "Hvid");
        // Samme attributter som bil1
        Bil bil1_1 = new Bil("AB12345", "Toyota", "Corolla", "Rød");
        // Samme attributter som bil2
        Bil bil2_1 = new Bil("CD67890", "BMW", "320i", "Sort");

        // Opret HashSet
        HashSet<Bil> bilerHashSet = new HashSet<>();

        // Indsæt biler
        bilerHashSet.add(bil1);
        bilerHashSet.add(bil2);
        bilerHashSet.add(bil3);
        bilerHashSet.add(bil1_1);
        bilerHashSet.add(bil2_1);

        for (Bil bil : bilerHashSet) {
            System.out.println(bil);
        }

        /**
         * Spørgsmål: Hvad sker der, når man indsætter to bil objekter,
         * der har præcis de samme attributter i det samme HashSet?
         * --> DET VIRKER!
         */



    }
}
