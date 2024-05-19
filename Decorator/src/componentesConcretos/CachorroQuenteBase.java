package componentesConcretos;

import componente.Lanche;

public class CachorroQuenteBase implements Lanche {
    
    public CachorroQuenteBase(){
        getDescricao();
    }
    public void preparar() throws InterruptedException{
        System.out.println("Colocando a Salsicha no Pão . . .");
        Thread.sleep(2000);
    }
    public float getPreco(){
        return 5f;
    }

    public String getDescricao(){
        return "Pão, Shaushicha";
    }

}
