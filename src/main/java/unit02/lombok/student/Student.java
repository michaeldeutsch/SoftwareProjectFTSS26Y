package unit02.lombok.student;
import lombok.*;

import java.util.ArrayList;

/**
 * Data model for a Student using Lombok.
 * Demonstrates various constructor annotations and @NonNull for required fields.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Student {

    int id;
    
    // NonNull fields will be included in the RequiredArgsConstructor
    @NonNull
    String name;
    @NonNull
    String first_name;
    @NonNull
    String last_name;
    
    String email;
    String phone;
    boolean isActive;
    ArrayList<String> lectures;


}
