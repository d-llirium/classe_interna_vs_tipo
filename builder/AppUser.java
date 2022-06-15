package builder;

public class AppUser {
    public static void main(String[] args) {
        // User u = new User("zd", "sdfsd", "sdfsdf", 12); -- formato "tradicional"
        User u = new User.UserBuilder("Araujo")
                .telefone("(11) 888888")
                .idade(30)
                .endereco("rua xxxx")
                .build();

        System.out.println(u);
    }
}
