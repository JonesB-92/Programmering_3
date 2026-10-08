package opgave02;

import java.util.HashMap;
import java.util.Map;

/**
 * I denne opgave skal I implementere Dictionary interfacet igen, med denne gange skal I bruge hashing.
 * <p>
 * Bemærk: null er ikke tilladt som hverken nøgle eller værdi.
 * <p>
 * I den udleverede kode er der lavet en delvis implementation DictionaryHashMap,
 * der implementerer interfacet som et array af java.util.HashMap.
 * <p>
 * 1. Kollision håndteres ved kædereglen.
 * Hashfunktionen er givet ved
 * ––> h(x) = x (mod N).
 * <p>
 * Læs den udleverede kode, så du er sikker på at du forstår, den inden du går i gang med at programmere.
 * <p>
 * 2. Programmer de manglende metoder (// TODO).
 * <p>
 * 3. Lav en applikation der afprøver implementationen.
 */

public class DictionaryHashMap<K, V> implements Dictionary<K, V> {
    private Map<K, V>[] table;
    private static final int N = 13;
    private int size;

    /**
     * HashingMap constructor comment.
     */
    public DictionaryHashMap() {
        table = new HashMap[N];
        for (int i = 0; i < N; i++) {
            table[i] = new HashMap<>();
        }
        size = 0;
    }


    /**
     * 1. Kollision håndteres ved kædereglen.
     * Hashfunktionen er givet ved
     * ––> h(x) = x (mod N).
     */
    @Override
    public int hashIndex(K k) {
        int index = k.hashCode();
        if (index < 0) {
            index = -index;
        }
        return index % N;
    }

    @Override
    public V get(K key) {
        int bucketIndex = hashIndex(key);

        return table[bucketIndex].get(key);
    }

    @Override
    public V put(K key, V value) {
        if (key == null || value == null) {
            throw new IllegalArgumentException("Må ikke være null!");
        }

        int bucketIndex = hashIndex(key);
        V oldValue = table[bucketIndex].put(key, value);

        if (oldValue == null) {
            size++;
        }

        return oldValue;
    }


    @Override
    public V remove(K key) {
        int bucketIndex = hashIndex(key);

        V oldValue = table[bucketIndex].remove(key);

        if (oldValue != null) {
            size--;
        }

        return oldValue;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
