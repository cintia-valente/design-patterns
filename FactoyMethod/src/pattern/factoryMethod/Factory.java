package pattern.factoryMethod;

import pattern.domain.Moeda;
import pattern.domain.Pais;

public interface Factory {

    public Moeda criarMoeda(Pais pais);
}
