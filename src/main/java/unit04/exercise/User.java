package unit04.exercise;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    String username;
    String password;
    Roles role;
}
