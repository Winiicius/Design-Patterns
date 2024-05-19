package decoratorConcretos;

import decoratorAbstrato.CachorroQuenteDecorator;
import componente.Lanche;

public class Milho extends CachorroQuenteDecorator{
    
    public Milho(Lanche lanche){
        super(lanche);
    }
    public String getDescricao(){
        return lanche.getDescricao() + ", Milho";
    }
    @Override
    public float getPreco() {
        return lanche.getPreco() + 1.50f;
    }

    @Override
    public void preparar() throws InterruptedException {
        lanche.preparar();
        Thread.sleep(2000);
        System.out.println("Adicionando Milho . . .");
    }
}
