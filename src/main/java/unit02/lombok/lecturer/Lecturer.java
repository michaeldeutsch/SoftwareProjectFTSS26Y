package unit02.lombok.lecturer;

import lombok.Builder;
import lombok.Data;

/**
 * Data model for a Lecturer using Lombok annotations.
 * @Data provides getters, setters, toString, equals, and hashCode.
 * @Builder implements the Builder pattern for flexible object creation.
 */
@Data
@Builder
public class Lecturer {

    int id;
    String name;
    String email;

}
