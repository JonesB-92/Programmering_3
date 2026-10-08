package opgave01;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Opgave01 {
    public static void main(String[] args) {
        // Liste med tal mellem 1 - 50
        List<Integer> list = List.of(1, 2, 3, 2, 1, 6, 3, 4, 5, 2, 3, 8, 8, 9, 34, 32);

//        list.forEach(e -> System.out.println(e + 1));

        //	Udskriver det største element i listen
        System.out.println("\n1. Største element i listen: " + list.stream().max(Integer::compareTo).get());

        //	Afgør og udskriver om alle tallene i listen er mindre end 50
        System.out.println("\n2. Alle tal er mindre end 50: " + list.stream().allMatch(e -> e < 50));

        // 	Udskriver antallet af lige tal i listen
        System.out.println("\n3. Antal lige tal: " + list.stream().filter(e -> e % 2 == 0).count());

        //	Udskriver antallet af ulige tal i listen
        System.out.println("\n4. Antal ulige tal: " + list.stream().filter(e -> e % 2 != 0).count());

        //  Udskriver gennemsnittet af tallene i listen
        System.out.println("\n5. a: Gennemsnit af tal i listen: " + list.stream()
                .mapToInt(Integer::intValue)
                .average().orElse(0));
                // eller .getAsDouble()
        double avg = list.stream()
                .mapToInt(Integer::intValue)
                .average().orElse(0);

        //      Antallet af tallene i listen
        System.out.println("\n5. b: Antal af tal i listen: " + list.stream().count());

        //      Antallet af tallene i listen der er større end gennemsnittet
        System.out.println("\n5. c: Antal, der er mindre end avg: " + list.stream()
                .filter(e -> e > list.stream().mapToInt(Integer::intValue).average().orElse(0))
                .count());

        //      Antallet af tallene i listen der er mindre end gennemsnittet
        System.out.println("\n5. c: Antal, der er mindre end avg: " + list.stream()
                .filter(e -> e < list.stream().mapToInt(Integer::intValue).average().orElse(0))
                .count());

        //	Udskriver antallet af gange de forskellige tal forekommer i listen
        System.out.println("\n6.a : Antal gange et tal forekommer i listen: " + list.stream()
                .collect((Collectors.groupingBy(Integer::intValue, Collectors.counting()))));

        // Udskriver antallet af gange de forskellige tal forekommer i listen, der er større end gennemsnittet
        System.out.println("\n6. b: Antal gange et tal forekommer i listen, der er større end gennemsnittet: " + list.stream()
                .filter(e -> e > avg)
                .collect((Collectors.groupingBy(Integer::intValue, Collectors.counting()))));

        // Udskriver antallet af gange de forskellige tal forekommer i listen, der er mindre end gennemsnittet
        System.out.println("\n6. c: Antal gange et tal forekommer i listen, der er mindre end gennemsnittet: " + list.stream()
                .filter(e -> e < list.stream().mapToInt(Integer::intValue).average().orElse(0))
                .collect((Collectors.groupingBy(Integer::intValue, Collectors.counting()))));

        //	Udskriver antallet af gange de forskellige tal forekommer i listen i sorteret orden
        /** Får først antal gange, de hver især forekommer ind i en Map */
        Map<Integer, Long> mapInt = list.stream().collect((Collectors.groupingBy(Integer::intValue, Collectors.counting())));
        /** Sorterer Mappet efter key*/
        mapInt.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));

        //ELLER
        Map<Integer, Long> mapInt2 = list.stream().collect((Collectors.groupingBy(Integer::intValue, TreeMap::new, Collectors.counting())));
        System.out.println("\n" + mapInt2);
    }

}
