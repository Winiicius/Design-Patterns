package prototypeConcreto;

import enums.TipoElemento;
import prototypeSupertipo.ElementoMapa;

public class Obstaculo extends ElementoMapa {

    private int largura;
    private int altura; 
    private boolean breakable;

    public Obstaculo(){
        this.tipo = TipoElemento.of("Obstaculo");
    }

    private Obstaculo(Obstaculo template){
        this.tipo = template.tipo;
        this.largura = template.largura;
        this.altura = template.altura;
        this.breakable = template.breakable;
    }

    @Override
    public String toString() {
        return super.tipo.getDescricao() + ":\nLargura: " + this.largura + 
                "\nAltura: " + this.altura +
                "\nQuebrável: " + this.breakable + "\n";
    }

    
    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }
    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public boolean isBreakable() {
        return breakable;
    }

    public void setBreakable(boolean breakable) {
        this.breakable = breakable;
    }

    @Override
    public ElementoMapa clone() {
        return new Obstaculo(this);
    }
    
}
