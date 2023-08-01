package receiver;

public class Camera {
    private Boolean estaLigada = false;

    public Camera(String nome) {}

    public Boolean getVerificaEstaLigada() {
        return estaLigada;
    }

    public void setEstaLigada(Boolean estaLigada) {
        this.estaLigada = estaLigada;
    }


}
