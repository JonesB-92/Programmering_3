package opgave02;

/**
 * This program demonstrates the hash set class.
 */
public class HashSetDemo {
    public static void main(String[] args) {
        MyHashSetChaining<String> names = new MyHashSetChaining(13);
        //opgave02.MyHashSetLinearProbing names = new opgave02.MyHashSetLinearProbing(13);

        names.add("Harry");
        names.add("Sue");
        names.add("Nina");
        names.add("Susannah");
        names.add("Larry");
        names.add("Eve");
        names.add("Sarah");
        names.add("Adam");
        names.add("Tony");
        names.add("Katherine");
        names.add("Juliet");
        names.add("Romeo");
        names.writeOut();
        System.out.println();

        System.out.println(names.size());
        System.out.println(names.contains("Romeo"));

        System.out.println("----------- Remove");
        System.out.println("Remove(Romeo): " + names.remove("Romeo"));
        names.remove("Romeo");
        System.out.println("Contains(Romeo):" + names.contains("Romeo"));
        System.out.println(names.size());

        System.out.println("Contains(George): " + names.contains("George"));
        System.out.println("Remove(George): " + names.remove("George"));
        System.out.println(names.size());
        System.out.println();
        names.writeOut();
        System.out.println();

    }
}
