package pattern.builder;

import pattern.domain.builder.Pessoa;

public class PessoaBuilder {

    public static void main(String[] args) {
        new Pessoa.PessoaBuilder()
                .firstName("Maria")
                .lastName("Silva")
                .email("maria@email.com")
                .build();
    }

}
