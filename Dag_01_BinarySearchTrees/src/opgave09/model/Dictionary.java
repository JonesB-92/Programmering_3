package opgave09.model;

public interface Dictionary<K, V> {

    /**
     * Returnerer værdien V hoerende til noeglen K, hvis noeglen ikke findes
     * returneres null
     *
     * @param key noeglen elementet skal findes til
     * @return objektet med noegle key
     */
    public V get(K key);

    /**
     * Returnerer om dictionary er tom
     *
     * @return om map'en er tom
     */
    public boolean isEmpty();

    /**
     * Indsætter objektet value med nøgle key I dictionary. Hvis key allerede
     * eksisterer overskrives value hoerende til key vaerdi og den gamle value
     * returneres. Hvis key ikke er der returneres null. Hverken key eller value
     * maa vaere null
     *
     * @param key   noeglen objektet skal indsaettes med
     * @param value objektet der skal indsaettes
     * @return
     */
    public V put(K key, V value);

    /**
     * Fjerner (noegle, vaerdi)- parret med noeglen key fra dictionary'en og
     * value returneres.
     *
     * @param key noeglen der med tilhoerende objekt skal fjernes
     * @return objektet hoerende til noeglen key; null hvis key ikke findes
     */
    public V remove(K key);

    /**
     * Returnerer antallet af elementer i dictionary
     *
     * @return antal elementer i dictionary
     */
    public int size();



}