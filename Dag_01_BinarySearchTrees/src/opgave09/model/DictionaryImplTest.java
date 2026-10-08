package opgave09.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DictionaryImplTest {

    @org.junit.jupiter.api.Test
    void get() {
        // sut = system under test
        DictionaryImpl<Integer, String> sut = new DictionaryImpl<>();

        var actual = sut.get(42);
        assertEquals(null, actual);
        sut.put(42, "test");
        actual = sut.get(42);
        assertEquals("test", actual);
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
        DictionaryImpl<Integer, String> sut = new DictionaryImpl<>();
        boolean actual = sut.isEmpty();
        assertTrue(actual);

        sut.put(17, "test");
        actual = sut.isEmpty();
        assertFalse(actual);

    }

    @org.junit.jupiter.api.Test
    void put() {
        DictionaryImpl<Integer, String> sut = new DictionaryImpl<>();
        sut.put(42, "test");
        String actual = sut.get(42);

        sut.put(42, "test");
        assertEquals("test", actual);

    }

    @Test
    void putNullValues() {
        DictionaryImpl<Integer, String> sut = new DictionaryImpl<>();
        IllegalArgumentException actual = assertThrows(IllegalArgumentException.class, () ->
                sut.put(null, null));

        IllegalArgumentException actual1 = assertThrows(IllegalArgumentException.class, () ->
                sut.put(null, "test"));

        IllegalArgumentException actual2 = assertThrows(IllegalArgumentException.class, () ->
                sut.put(42, null));


        assertEquals("Key or value cannot be null", actual.getMessage());
        assertEquals("Key or value cannot be null", actual1.getMessage());
        assertEquals("Key or value cannot be null", actual2.getMessage());

    }

    @org.junit.jupiter.api.Test
    void remove() {
    }

    @org.junit.jupiter.api.Test
    void size() {
        DictionaryImpl<Integer, String> sut = new DictionaryImpl<>();
        sut.put(42, "test");
        int actual = sut.size();
        int expected = 1;

        assertEquals(expected, actual);
    }
}