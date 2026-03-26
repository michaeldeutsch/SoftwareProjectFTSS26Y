package unit04.exercise;

import java.util.HashMap;
import java.util.Map;

public class UserStore {


private static Map<String, User> users = new HashMap<>();

static {
    users.put("junior", new User("junior","junior", Roles.JUNIOR));
    users.put("senior", new User("senior","senior", Roles.ADMIN));
    users.put("sa", new User("sa","sa", Roles.SUPERADMIN));
}

private static AuthenticatedUser autheticate(String username, String password) {

    User user =  users.get(username);

    if (user != null && user.getPassword().equals(password)) {
        return new AuthenticatedUser(user.getUsername(), user.getRole());
    }


    return null;

}

public static void login(String user, String pwd){
    AuthenticatedUser attempt = UserStore.autheticate(user, pwd);

    if(attempt != null){
        System.out.println("Welcome " + attempt.getUsername() + ", " + attempt.getRole());
    }else{
        System.out.println("Access denied!");
    }
}
}