package decoratorConcretos;

import decoratorAbstrato.CachorroQuenteDecorator;
import componente.Lanche;

public class CarneMoida extends CachorroQuenteDecorator {
    public CarneMoida(Lanche lanche){
        super(lanche);
    }

    @Override
    public String getDescricao() {
        return lanche.getDescricao() + ", Carne Moída";
    }

    @Override
    public float getPreco() {
        return lanche.getPreco() + 3.50f;
    }

    @Override
    public void preparar() throws InterruptedException {
        lanche.preparar();
        Thread.sleep(2000);
        System.out.println("Adicionando a Carne Moída . . .");
    }
}
