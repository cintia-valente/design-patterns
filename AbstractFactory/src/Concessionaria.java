import pattern.interfaces.IRoda;
import pattern.interfaces.ISom;
import pattern.abstractFactory.AbstractFactory;
import pattern.abstractFactory.CarroLuxoFactory;
import pattern.abstractFactory.CarroPopularFactory;

public class Concessionaria {
    public static void main(String[] args) {

        AbstractFactory carroFactoryLuxo = new CarroLuxoFactory();
        IRoda roda1 = carroFactoryLuxo.montarRoda();
        ISom som1 = carroFactoryLuxo.montarSom();

        AbstractFactory carroFactoryPopular = new CarroPopularFactory();
        IRoda roda2 = carroFactoryPopular.montarRoda();
        ISom som2 = carroFactoryPopular.montarSom();

        System.out.println("Carro de luxo: " + roda1.getRoda().getClass().getSimpleName() + ", " +  som1.getSom().getClass().getSimpleName());
        System.out.println("Carro popular: " + roda2.getRoda().getClass().getSimpleName() + ", " + som2.getSom().getClass().getSimpleName());
    }
}