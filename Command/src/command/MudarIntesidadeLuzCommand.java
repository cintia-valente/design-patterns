package command;

import receiver.Luz;

public class MudarIntesidadeLuzCommand implements Command{

    private Luz luz;
    private String nome;

    public MudarIntesidadeLuzCommand(Luz luz, String nome) {
        this.luz = luz;
        this.nome = nome;
    }

    @Override
    public void executar() {
        int aumentarIntensidade = luz.getAumentarIntensidade();
        System.out.println("Intensidade da luz do(a) " + nome +  " = " + aumentarIntensidade);
    }

    @Override
    public void desfazer() {
        int diminuirIntensidade = luz.getAumentarIntensidade();
        System.out.println("Intensidade da luz do(a) " + nome +  " = " + diminuirIntensidade);
    }
}
