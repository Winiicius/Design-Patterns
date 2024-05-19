package cliente;

import componente.Lanche;
import componentesConcretos.CachorroQuenteBase;
import decoratorConcretos.BatataPalha;
import decoratorConcretos.CarneMoida;
import decoratorConcretos.Milho;

public class GuruDosDogoes {

    public static void main(String[] args) {
        Lanche cachorroQuente = new CachorroQuenteBase();
        cachorroQuente = new CarneMoida(cachorroQuente);
        cachorroQuente = new BatataPalha(cachorroQuente);
        cachorroQuente = new Milho(cachorroQuente);
        
        System.out.println("Descrição -> " + cachorroQuente.getDescricao() + "\nPreço -> R$ " + cachorroQuente.getPreco());

        try {
            cachorroQuente.preparar();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Pedido Pronto para ser Devorado!!");
    }
}