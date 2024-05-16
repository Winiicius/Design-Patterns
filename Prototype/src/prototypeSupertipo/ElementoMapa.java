package prototypeSupertipo;

import enums.TipoElemento;

public abstract class ElementoMapa implements Cloneable {

    protected TipoElemento tipo;

    public abstract ElementoMapa clone();
}