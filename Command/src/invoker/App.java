package invoker;

import command.Command;
import command.LigarLuzCommand;

import java.util.HashMap;
import java.util.Map;

public class App {

    private Map<String, Command> comandos;

    public App() {
        this.comandos = new HashMap<>();
    }

    public void adicionarComando(String chave, Command comando) {
        this.comandos.put(chave, comando);
    }

    public void executarComando(String chave) {
        Command comando = this.comandos.get(chave);
        if (comando != null) {
            comando.executar();
        } else {
            System.out.println("Comando não encontrado para a chave especificada: " + chave);
        }
    }

    public void desfazerComando(String chave) {
        Command comando = this.comandos.get(chave);
        if (comando != null) {
            comando.desfazer();
        } else {
            System.out.println("Comando não encontrado para a chave especificada: " + chave);
        }
    }
}


