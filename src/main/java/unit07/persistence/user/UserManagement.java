package unit07.persistence.user;

public class UserManagement {

    public static void main(String[] args) {
        UserDao dao = new UserDao(HibernateUtil.getSessionFactory());

        logSection("CREATE");
        UserEntity adminUser = UserEntity.builder()
                .userId("admin")
                .password("secret")
                .role(UserRole.MASTER)
                .build();
        dao.save(adminUser);
        System.out.println("Saved: " + adminUser);

        logSection("GET BY ID");
        dao.findById("admin").ifPresent(user -> System.out.println("Found: " + user));

        logSection("GET ALL");
        dao.findAll().forEach(System.out::println);

        logSection("UPDATE");
        adminUser.setRole(UserRole.SENIOR);
        dao.update(adminUser);
        System.out.println("Updated: " + adminUser);

        logSection("DELETE");
        dao.delete("admin");
        System.out.println("Deleted user: admin");

        logSection("GET ALL AFTER DELETE");
        dao.findAll().forEach(System.out::println);

        HibernateUtil.getSessionFactory().close();
    }

    private static void logSection(String title) {
        System.out.println("\n==== " + title + " ===================================\n");
    }
}