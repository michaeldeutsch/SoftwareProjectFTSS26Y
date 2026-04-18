package unit04.auth_logic;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    String username;
    String password;
    Roles role;
}
