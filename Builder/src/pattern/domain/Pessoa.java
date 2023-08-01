package pattern.domain;

public class Pessoa {

    private String firstName;
    private String lastName;
    private String email;

    public Pessoa(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public static class PessoaBuilder {
        private String firstName;
        private String lastName;
        private String email;

        public PessoaBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PessoaBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PessoaBuilder email(String email) {
            this.email = email;
            return this;
        }

        public Pessoa build() {
            return new Pessoa(firstName, lastName, email);
        }
    }
}
