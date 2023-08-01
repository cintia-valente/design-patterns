package pattern.domain.roda;

import pattern.interfaces.IRoda;

public class RodaLigaLeveRoda implements IRoda {

    public Roda getRoda() {
        return new RodaLigaLeve();
    }
}
