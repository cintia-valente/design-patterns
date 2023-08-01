package pattern.domain.som;

import pattern.interfaces.ISom;

public class CDPlayerSom implements ISom {

    public Som getSom() {
        return new CDPlayer();
    }
}
