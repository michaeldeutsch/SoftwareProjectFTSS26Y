package unit04.auth_logic;

public class MyApp {
    public static void main(String[] args) {
        UserStore.login("junior", "junior");
        UserStore.login("junior", "j");
        UserStore.login("sa", "sa");
    }
}
