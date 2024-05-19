package decoratorConcretos;

import componente.Lanche;
import decoratorAbstrato.CachorroQuenteDecorator;

public class CarneDeFrango extends CachorroQuenteDecorator{
    
    public CarneDeFrango(Lanche lanche){
        super(lanche);
    }

    @Override
    public String getDescricao() {
        return lanche.getDescricao() + ", Carne de Frango";
    }

    @Override
    public float getPreco() {
        return lanche.getPreco() + 3.50f;
    }

    @Override
    public void preparar() throws InterruptedException {
        lanche.preparar();
        Thread.sleep(2000);
        System.out.println("Adicionando a Carne de Frango . . .");
    }
}
