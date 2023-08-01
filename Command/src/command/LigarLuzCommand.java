package command;

import receiver.Luz;

public class LigarLuzCommand implements Command{

    private Luz luz;
    private String comodo;

    public LigarLuzCommand(Luz luz, String comodo) {
        this.luz = luz;
        this.comodo = comodo;
    }

    @Override
    public void executar() {
        boolean estaLigada = luz.getVerificaEstaLigada();
        System.out.println("A luz do(a) " + comodo +  " está ligada");
    }

    @Override
    public void desfazer() {
        boolean estaDesligada = luz.getVerificaEstaLigada();
        System.out.println("A luz do(a) " + comodo +  " está desligada");
    }
}
