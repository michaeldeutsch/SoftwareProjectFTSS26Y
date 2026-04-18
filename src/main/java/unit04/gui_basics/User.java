package unit04.gui_basics;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

    String username;
    String password;
    String role;
}
