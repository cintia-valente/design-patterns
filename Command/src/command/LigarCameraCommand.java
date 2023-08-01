package command;

import receiver.Camera;

public class LigarCameraCommand implements Command {

    private Camera camera;

    private String comodo;

    public LigarCameraCommand(Camera camera, String comodo) {
        this.camera = camera;
        this.comodo = comodo;
    }


    @Override
    public void executar() {
        boolean estaLigada = camera.getVerificaEstaLigada();
        System.out.println("A câmera do(a) " + comodo +  " está ligada");
    }

    @Override
    public void desfazer() {
        boolean estaDesligada = camera.getVerificaEstaLigada();
        System.out.println("A câmera do(a) " + comodo +  " está desligada");
    }
}
