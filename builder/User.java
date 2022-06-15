package builder;

public class User {

    // ATRIBUTOS
    private String nome, telefone, endereco;
    private int idade;

    // MÉTODOS
    // construtor
    private User(UserBuilder builder) {
        this.nome = builder.nome;
        this.endereco = builder.endereco;
        this.telefone = builder.telefone;
        this.idade = builder.idade;
    }

    @Override
    public String toString() {
        return nome + ", " + endereco + ", " + telefone + ", " + idade;
    }

    // CLASSE USER BUILDER
    // construtor
    public static class UserBuilder {
        
        // ATRIBUTOS
        private String nome, telefone, endereco;
        private int idade;

        // MÉTODOS
        public UserBuilder(String nome) {
            this.nome = nome;
        }

        public UserBuilder telefone(String telefone) {
            this.telefone = telefone;
            return this;
        }

        public UserBuilder endereco(String endereco) {
            this.endereco = endereco;
            return this;
        }

        public UserBuilder idade(int idade) {
            this.idade = idade;
            return this;
        }

        // -- invoca o construtor do USER aqui
        public User build() {
            User user = new User(this);
            return user;
        }
    }
}

