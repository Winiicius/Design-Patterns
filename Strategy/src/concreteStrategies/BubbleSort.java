package concreteStrategies;

import concreteStrategies.util.Trocar;
import interfaceStrategy.AlgoritmoOrdenacaoStrategy;

public class BubbleSort implements AlgoritmoOrdenacaoStrategy {

    public int[] ordenar(int[] v) {
        for(int i = 0; i < v.length - 1 ; i++) {
            boolean estaOrdenado = true;
            for(int j = 0; j < v.length -1 -i ; j++) {
                if(v[j] >= (v[j+1])) {
                    Trocar.trocar(v,j,j+1);
                    estaOrdenado = false;
                }
            }
            if(estaOrdenado)
                break;
        }
        return v;
    }
}
