package opgave01;


public class Main {
    public static void main(String[] args) {
        Range range = new Range(-3, 10);

        for (Integer next : range) {
            System.out.println(next);
        }

        //SAMME SOM:
        Integer it = 10;
        while(true/*it.hasNext()*/) {
            System.out.println(it);
        }
    }
}
