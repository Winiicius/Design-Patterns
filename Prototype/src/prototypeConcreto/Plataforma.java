package prototypeConcreto;

import enums.TipoElemento;
import enums.TipoPlataforma;
import prototypeSupertipo.ElementoMapa;

public class Plataforma extends ElementoMapa {

    private TipoPlataforma tipoPlataforma;
    private int altura;
    private int largura;

    public Plataforma(){
        this.tipo = TipoElemento.of("Plataforma");
    };

    private Plataforma(Plataforma template){
        this.tipo = template.tipo;
        this.tipoPlataforma = template.tipoPlataforma;
        this.altura = template.altura;
        this.largura = template.largura;
    }

    @Override
    public String toString() {
        return super.tipo.getDescricao() + ": " + this.tipoPlataforma.getDescricao() + 
                "\nLargura: " + this.largura +
                "\nAltura: " + this.altura + "\n";
    }

    public TipoPlataforma getTipoPlataforma() {
        return tipoPlataforma;
    }

    public void setTipoPlataforma(TipoPlataforma tipoPlataforma) {
        this.tipoPlataforma = tipoPlataforma;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    @Override
    public ElementoMapa clone() {
        return new Plataforma(this);
    }
    
}
