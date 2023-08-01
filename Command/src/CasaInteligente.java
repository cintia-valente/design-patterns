import command.Command;
import command.LigarCameraCommand;
import command.LigarLuzCommand;
import command.MudarIntesidadeLuzCommand;
import invoker.App;
import receiver.Camera;
import receiver.Luz;

public class CasaInteligente {
    public static void main(String[] args) {

        //Receiver
        Luz luzSala = new Luz("Sala");
        Luz luzQuarto = new Luz("Quarto");

        Camera cameraSala = new Camera("Sala");
        Camera cameraCozinha = new Camera("Cozinha");

        //Command
        Command ligarLuzSala = new LigarLuzCommand(luzSala, "sala");
        Command ligarLuzQuarto = new LigarLuzCommand(luzQuarto, "quarto");

        Command ligarCameraSala = new LigarCameraCommand(cameraSala, "sala");
        Command ligarCameraCozinha = new LigarCameraCommand(cameraCozinha, "cozinha");

        Command aumentarLuzSala = new MudarIntesidadeLuzCommand(luzSala, "sala");

        //Invoker
        App invoker = new App();

        System.out.println();
        invoker.adicionarComando("botãoLigar", ligarLuzSala);
        invoker.executarComando("botãoLigar");

        invoker.adicionarComando("botãoDesligar", ligarLuzQuarto);
        invoker.desfazerComando("botãoDesligar");

        invoker.adicionarComando("botãoAumentar", aumentarLuzSala);
        invoker.executarComando("botãoAumentar");

        System.out.println();

        invoker.adicionarComando("botãoLigar", ligarCameraSala);
        invoker.executarComando("botãoLigar");

        invoker.adicionarComando("botãoLigar", ligarCameraCozinha);
        invoker.executarComando("botãoLigar");
    }
}