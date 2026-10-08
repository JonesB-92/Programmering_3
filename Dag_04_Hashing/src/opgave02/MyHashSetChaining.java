package opgave02;

public class MyHashSetChaining<E> implements MySet<E> {
    // The number of elements in the set
    private int size = 0;

    // Hash table is an array with each cell that is a linked list
    private Node<E>[] table;

    public MyHashSetChaining(int bucketsLength) {
        table = (Node<E>[]) new Node[bucketsLength];
        size = 0;
    }

    /**
     * Hash function
     */
    private int hash(int hashCode) {
        if (hashCode < 0) {
            hashCode = -hashCode;
        }
        return hashCode % table.length;
    }

    @Override
    /** Return true if the element is in the set */
    public boolean contains(E e) {
        int bucketIndex = hash(e.hashCode());
        Node<E> current = table[bucketIndex];
        boolean found = false;
        while (!found && current != null) {
            if (current.data.equals(e)) {
                found = true;
            } else {
                current = current.next;
            }
        }
        return found;
    }

    @Override
    /** Add an element to the set */
    public boolean add(E e) {
        int bucketIndex = hash(e.hashCode());
        Node<E> current = table[bucketIndex];
        boolean found = false;
        while (!found && current != null) {
            if (current.data.equals(e)) {
                found = true;
                // Already in the set
            } else {
                current = current.next;
            }
        }
        if (!found) {
            Node newNode = new Node();
            newNode.data = e;
            newNode.next = table[bucketIndex];
            table[bucketIndex] = newNode;
            size++;

            if ((size / (table.length * 1.0)) > 0.75) {
                rehash();
            }
        }
        return !found;
    }

    //Programmer metoderne remove og clear.
    @Override
    /** Remove the element from the set */
    public boolean remove(E e) {
        int buckIndex = hash(e.hashCode());
        Node<E> current = table[buckIndex];
        Node<E> previous = null;

        // Løbe igennem for at se, om elementet findes
        while (current != null) {
            //Når jeg finder
            if (current.data.equals(e)) {
                //Hvis det er første element i nodelisten
                if (previous == null) {
                    table[buckIndex] = current.next;
                    current.data = null;
                    current = null;
                    size--;
                } else {
                    // Hvis ikke:
                    previous.next = current.next;
                    current.data = null;
                    current = null;
                    size--;
                }
                return true;
            } else {
                previous = current;
                current = current.next;
            }
        }
        return false;
    }

    @Override
    /** Remove all elements from this set */
    public void clear() {
        for (int i = 0; i < table.length; i++) {
            table[i] = null;
        }
        size = 0;

        //ELLER
        /**
         * table = new Node[table.length];
         * size = 0;
         */
    }


    //Lav en metode rehash() der kaldes fra add-metoden, når load faktoren bliver større end 0.75.
    //Load faktoren for en hash tabel beregnes som 𝜆 = 𝑛 / 𝑁, hvor n er antallet af elementer og N er kapaciteten for tabellen
    public void rehash() {
        //Lave "temp" Node<E>[]
        Node<E>[] oldTable = table;

        //Gør originale table til et nyt table med cap * 2
        table = (Node<E>[]) new Node[table.length * 2];

        //Reset size
        size = 0;

        //Smide elementer fra gamle table ind i det nye
        for (Node<E> eNode : oldTable) {
            Node<E> current = eNode;

            while (current != null) {
                add(current.data);
                size++;
                current = current.next;
            }
        }
    }

    @Override
/** Return true if the set contains no elements */
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
/** Return the number of elements in the set */
    public int size() {
        return size;
    }

    // method only for test purpose
    void writeOut() {
        for (int i = 0; i < table.length; i++) {
            Node<E> temp = table[i];
            if (temp != null) {
                System.out.print(i + "\t");
                while (temp != null) {
                    System.out.print(temp.data + "\t");
                    temp = temp.next;
                }
                System.out.println();
            }
        }
    }

    private class Node<E> {
        public E data;
        public Node<E> next;
    }

}
