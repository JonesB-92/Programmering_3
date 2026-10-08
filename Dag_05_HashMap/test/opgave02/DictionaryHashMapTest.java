package opgave02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DictionaryHashMapTest {

    private DictionaryHashMap<String, Integer> dictionary;

    @BeforeEach
    void setUp() {
        dictionary = new DictionaryHashMap<>();
    }

    @Test
    void testIsEmptyInitially() {
        assertTrue(dictionary.isEmpty());
        assertEquals(0, dictionary.size());
    }

    @Test
    void testPutAndGet() {
        assertNull(dictionary.put("One", 1));
        assertFalse(dictionary.isEmpty());
        assertEquals(1, dictionary.size());
        assertEquals(1, dictionary.get("One"));
    }

    @Test
    void testPutOverwrite() {
        dictionary.put("One", 1);
        assertEquals(1, dictionary.put("One", 11));
        assertEquals(1, dictionary.size());
        assertEquals(11, dictionary.get("One"));
    }

    @Test
    void testGetNonExistent() {
        assertNull(dictionary.get("Two"));
    }

    @Test
    void testRemove() {
        dictionary.put("One", 1);
        dictionary.put("Two", 2);
        assertEquals(1, dictionary.remove("One"));
        assertEquals(1, dictionary.size());
        assertNull(dictionary.get("One"));
        assertEquals(2, dictionary.get("Two"));
    }

    @Test
    void testRemoveNonExistent() {
        dictionary.put("One", 1);
        assertNull(dictionary.remove("Two"));
        assertEquals(1, dictionary.size());
    }

    @Test
    void testSize() {
        assertEquals(0, dictionary.size());
        dictionary.put("One", 1);
        assertEquals(1, dictionary.size());
        dictionary.put("Two", 2);
        assertEquals(2, dictionary.size());
        dictionary.remove("One");
        assertEquals(1, dictionary.size());
    }

    @Test
    void testMultipleBuckets() {
        // Since N is 13, adding 20 items should definitely hit all/most buckets
        for (int i = 0; i < 20; i++) {
            dictionary.put("Key" + i, i);
        }
        assertEquals(20, dictionary.size());
        for (int i = 0; i < 20; i++) {
            assertEquals(i, dictionary.get("Key" + i));
        }
    }
}
