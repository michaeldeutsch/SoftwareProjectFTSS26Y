package unit04.exercise;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthenticatedUser {
    String username;
    Roles role;
}
