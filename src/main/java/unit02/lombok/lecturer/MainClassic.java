package unit02.lombok.lecturer;

/**
 * Demonstrates object creation using the Lombok-generated Builder pattern.
 */
public class MainClassic {
    public static void main(String[] args) {
        // Fluent builder API provided by @Builder
        Lecturer first = Lecturer.builder().id(1).email("asdfas").name("asdf").build();
        Lecturer second = Lecturer.builder().id(1).name("234").build();
        
        // toString() implementation provided by @Data
        System.out.println(first);
        System.out.println(second);

    }
}
