package pattern.abstractFactory;

import pattern.interfaces.IRoda;
import pattern.interfaces.ISom;
import pattern.domain.roda.RodaLigaLeveRoda;
import pattern.domain.som.MultimidiaSom;

public class CarroLuxoFactory implements AbstractFactory {

    public IRoda montarRoda() {
        return new RodaLigaLeveRoda();
    }

    public ISom montarSom() {
        return new MultimidiaSom();
    }
}
