package unit04.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Demonstrates the use of the Map data structure in Java.
 * A Map stores key-value pairs, allowing efficient retrieval by key.
 */
public class HashMapDemo {

    public static void main(String[] args) {

        // HashMap is a common implementation for key-based lookups
        Map<String, String> dict = new HashMap<>();

        // Store ISO country codes as keys and country names as values
        dict.put("DE", "Deutschland");
        dict.put("EN", "England");
        dict.put("FR", "Frankreich");
        dict.put("IT", "Italien");
        dict.put("ES", "Spanien");

        // Retrieve a value by its key
        String translation = dict.get("DE");
        System.out.println(translation);

        // Iterate over all entries in the map using a lambda expression
        dict.forEach((k, v) -> System.out.println(k + " -> " + v));

    }
}
