package unit02.lombok.student;
import lombok.*;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Student {

    int id;
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
