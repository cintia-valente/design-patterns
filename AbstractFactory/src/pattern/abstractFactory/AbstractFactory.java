package pattern.abstractFactory;

import pattern.interfaces.IRoda;
import pattern.interfaces.ISom;

public interface AbstractFactory {

   public IRoda montarRoda();
   public ISom montarSom();
}
