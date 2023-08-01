package receiver;

public class Luz {

    private Boolean estaLigada = false;
    private int intensidade = 50;

    public Luz(String nome) {}

    public Boolean getVerificaEstaLigada() {
        return estaLigada;
    }

    public void setEstaLigada(Boolean estaLigada) {
        this.estaLigada = estaLigada;
    }

    public int getAumentarIntensidade() {
        return intensidade + 1;
    }

    public int getDiminuirIntensidade() {
        return intensidade - 1;
    }

    public void setIntensidade(int intensidade) {
        this.intensidade = intensidade;
    }
}
