package context;

import interfaceStrategy.AlgoritmoOrdenacaoStrategy;

public class Ordenador {

    private AlgoritmoOrdenacaoStrategy algoritmo;

    public Ordenador(AlgoritmoOrdenacaoStrategy algoritmo){
        this.algoritmo = algoritmo;
    }

    public int[] ordenar(int[] vetor) {
        if (algoritmo != null) {
            return algoritmo.ordenar(vetor);
        } else {
            System.out.println("Algoritmo de Ordenação não definido.");
            return null;
        }
    }

    public void setAlgoritmoOrdenacao(AlgoritmoOrdenacaoStrategy algoritmo) {
        this.algoritmo = algoritmo;
    }    


}