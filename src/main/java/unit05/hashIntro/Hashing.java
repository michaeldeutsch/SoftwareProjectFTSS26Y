package unit05.gui;

/**
 * Basic example demonstrating the concept of Hashing in Java.
 * Uses the default hashCode() implementation to show consistency for identical strings.
 */
public class Hashing {
    public static void main(String[] args) {
        String password = "Somefancypassword";
        String password2 = "Somefancypassword";
        
        // Output hash codes to demonstrate that identical strings produce identical hashes
        System.out.println(password.hashCode());
        System.out.println(password2.hashCode());
    }
}
