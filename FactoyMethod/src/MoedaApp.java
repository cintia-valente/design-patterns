import pattern.domain.Moeda;
import pattern.domain.Pais;
import pattern.factoryMethod.Factory;
import pattern.factoryMethod.MoedaFactory;

public class MoedaApp {

    public static void main(String[] args) {

        //Cria a fábrica
        Factory factory = new MoedaFactory();

        //Cria uma moeda
        Moeda moedaBR = factory.criarMoeda(Pais.BRASIL);
        Moeda moedaUSA = factory.criarMoeda(Pais.USA);

        System.out.println("Moeda do Brasil: " + moedaBR.getSimbolo());
        System.out.println("Moeda dos USA: " + moedaUSA.getSimbolo());
    }
}
