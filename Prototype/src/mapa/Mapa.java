package mapa;

import java.util.ArrayList;
import java.util.List;

import prototypeSupertipo.ElementoMapa;

public class Mapa {

    List<ElementoMapa> elementos = new ArrayList<ElementoMapa>();

    @Override
    public String toString() {
        System.out.println("Elementos Presentes no Mapa:");
        for (ElementoMapa elemento : elementos) {
            System.out.println(elemento.toString());
        }
        return "";
    }

    public void adicionarElemento(ElementoMapa elemento){
        this.elementos.add(elemento);
    }
    
    public List<ElementoMapa> getElementos() {
        return elementos;
    }

    public void setElementos(List<ElementoMapa> elementos) {
        this.elementos = elementos;
    }
}
