package pattern.factoryMethod;

import pattern.domain.Dolar;
import pattern.domain.Pais;
import pattern.domain.Moeda;
import pattern.domain.Real;

public class MoedaFactory implements Factory {

    @Override
    public Moeda criarMoeda(Pais pais) {
        switch (pais) {
            case BRASIL:
                return new Real();
            case USA:
                return new Dolar();
            default:
                throw new IllegalArgumentException("Não existe moeda para este país!");
        }
    }
}
