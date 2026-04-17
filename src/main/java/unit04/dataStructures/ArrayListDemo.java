package unit04.dataStructures;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Demonstrates basic usage of Arrays and ArrayLists.
 * Shows how to add elements, sort a list, and how characters are represented as integers.
 */
public class ArrayListDemo {

    public static void main(String[] args) {

        // Traditional fixed-size array
        String [] someDATA= new String[10];
        
        // Dynamic ArrayList
        ArrayList<String> someDATA2= new ArrayList<>();

        someDATA2.add("Zebra");
        someDATA2.add("Lion");
        someDATA2.add("Lephant");
        someDATA2.add("Ant");

        // Sort the list alphabetically
        Collections.sort(someDATA2);
        someDATA2.forEach(System.out::println);

        // Demonstrating ASCII/Unicode values of characters
        char c = 'Z';
        System.out.println((int) c); // Should print 90
        System.out.println((int) 'A'); // Should print 65
        System.out.println(c);

    }
}
