package decoratorConcretos;

import decoratorAbstrato.CachorroQuenteDecorator;
import componente.Lanche;

public class BatataPalha extends CachorroQuenteDecorator{

    public BatataPalha(Lanche lanche){
        super(lanche);
    }

    @Override
    public void preparar() throws InterruptedException {
        lanche.preparar();
        Thread.sleep(2000);
        System.out.println("Adicionando batata Palha . . .");
    }

    @Override
    public String getDescricao() {
        return lanche.getDescricao() + ", Batata Palha"; 
    }
    
    @Override
    public float getPreco() {
        return lanche.getPreco() + 1f;
    }

}
