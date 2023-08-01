package pattern.domain.roda;

import pattern.interfaces.IRoda;

public class RodaSimplesRoda implements IRoda {

    public Roda getRoda() {
        return new RodaSimples();
    }
}
