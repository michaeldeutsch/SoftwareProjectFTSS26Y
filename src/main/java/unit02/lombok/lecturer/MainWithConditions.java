package unit02.lombok.lecturer;

/**
 * Demonstrates conditional builder usage.
 */
public class MainWithConditions {

    public static void main(String[] args) {

        String email = "lecturer@example.com"; 

        // Start building the object with mandatory fields
        var temp = Lecturer.builder().id(1).name("John Doe"); 

        // Conditionally add optional fields before calling build()
        if(email != null && !email.isEmpty()) {
            temp.email(email);
        }

        // Finalize the object creation
        Lecturer l = temp.build();
        System.out.println(l);
    }
}
