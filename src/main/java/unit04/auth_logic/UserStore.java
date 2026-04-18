package unit04.auth_logic;

import java.util.HashMap;
import java.util.Map;

/**
 * A central store to manage and authenticate users.
 * Demonstrates basic role-based authentication logic and using Maps for storage.
 */
public class UserStore {

    // Internal storage for all known users in the system
    private static final Map<String, User> users = new HashMap<>();

    // Populate the store with mock data upon class loading
    static {
        users.put("junior", new User("junior", "junior", Roles.JUNIOR));
        users.put("senior", new User("senior", "senior", Roles.ADMIN));
        users.put("sa", new User("sa", "sa", Roles.SUPERADMIN));
    }

    /**
     * Internal method to check credentials and return an AuthenticatedUser if successful.
     */
    private static AuthenticatedUser authenticate(String username, String password) {
        User user = users.get(username);

        // Verify if user exists and password matches
        if (user != null && user.getPassword().equals(password)) {
            return new AuthenticatedUser(user.getUsername(), user.getRole());
        }

        return null;
    }

    /**
     * Public login interface that provides feedback to the console.
     */
    public static void login(String user, String pwd) {
        AuthenticatedUser attempt = UserStore.authenticate(user, pwd);

        if (attempt != null) {
            System.out.println("Welcome " + attempt.getUsername() + ", " + attempt.getRole());
        } else {
            System.out.println("Access denied!");
        }
    }
}
