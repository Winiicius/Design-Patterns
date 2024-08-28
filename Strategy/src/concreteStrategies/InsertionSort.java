package concreteStrategies;

import interfaceStrategy.AlgoritmoOrdenacaoStrategy;

public class InsertionSort implements AlgoritmoOrdenacaoStrategy{
    
    public int[] ordenar(int[] vetor){

        for (int i = 0; i < vetor.length; i++) {
            int atual = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] >= atual) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = atual;
        }
        return vetor;
    }
}
