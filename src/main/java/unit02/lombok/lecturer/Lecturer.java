package unit02.lombok.lecturer;

import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class Lecturer {

    int id;
    String name;
    String email;

}
