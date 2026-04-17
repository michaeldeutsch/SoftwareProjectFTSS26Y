package unit04.dataStructures;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * Demonstrates the use of Set data structures in Java.
 * Sets are collections that do not allow duplicate elements.
 */
public class SetDemo {

    public static void main(String[] args) {
        // HashSet does not maintain order but offers high performance
        HashSet<String> set = new HashSet<>();
        set.add("asdf");
        set.add("asdf"); // Duplicates will be ignored
        set.add("asdf");
        set.add("asdf");
        set.add("asdf");
        set.add("asdf");

        // TreeSet maintains natural ordering of elements
        TreeSet<String> treeSet = new TreeSet<>();

        // Output all elements in the set
        set.forEach(System.out::println);

    }
}
