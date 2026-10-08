package examples.iterator;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyArray<String> myArray = new MyArray<>();
        myArray.add(0, "AGF");
        myArray.add(1, "FCM");
        myArray.add(6, "FCK");

        Iterator<String> iterator = myArray.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();

        for (String team : myArray) {
            System.out.println(team);
        }

        System.out.println();

        myArray.forEach(System.out::println);
    }
}
