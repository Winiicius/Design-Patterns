package prototypeConcreto;

import enums.TipoAtaque;
import enums.TipoElemento;
import enums.TipoInimigo;
import prototypeSupertipo.ElementoMapa;

public class Inimigo extends ElementoMapa {

    private int pontosVida;
    private TipoInimigo tipoInimigo;
    private TipoAtaque tipoAtaque;

    public Inimigo(){
        this.tipo = TipoElemento.of("Inimigo");
    }

    private Inimigo(Inimigo template){
        this.tipo = template.tipo;
        this.pontosVida = template.pontosVida;
        this.tipoInimigo = template.tipoInimigo;
        this.tipoAtaque = template.tipoAtaque;
    }

    @Override
    public String toString() {
        return super.tipo.getDescricao() + ": " + this.tipoInimigo.getDescricao() + "\nPontos de Vida: " + this.pontosVida + 
                 "\nTipo Ataque: " + this.tipoAtaque.getDescricao() + "\n";
    }

    public int getPontosVida() {
        return pontosVida;
    }

    public void setPontosVida(int pontosVida) {
        this.pontosVida = pontosVida;
    }

    public TipoInimigo getTipoInimigo() {
        return tipoInimigo;
    }

    public void setTipoInimigo(TipoInimigo tipoInimigo) {
        this.tipoInimigo = tipoInimigo;
    }

    public TipoAtaque getTipoAtaque() {
        return tipoAtaque;
    }

    public void setTipoAtaque(TipoAtaque tipoAtaque) {
        this.tipoAtaque = tipoAtaque;
    }

    @Override
    public ElementoMapa clone() {
        return new Inimigo(this);
    }
    
}
