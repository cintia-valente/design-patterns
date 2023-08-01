package pattern.abstractFactory;

import pattern.interfaces.IRoda;
import pattern.interfaces.ISom;
import pattern.domain.roda.RodaSimplesRoda;
import pattern.domain.som.CDPlayerSom;

public class CarroPopularFactory implements AbstractFactory {


    public IRoda montarRoda() {
        return new RodaSimplesRoda();
    }

    public ISom montarSom() {
        return new CDPlayerSom();
    }


}
