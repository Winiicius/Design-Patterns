package decoratorAbstrato;

import componente.Lanche;

public abstract class CachorroQuenteDecorator implements Lanche {

    protected Lanche lanche;

    protected CachorroQuenteDecorator(Lanche lanche){
        this.lanche = lanche;
    }

}