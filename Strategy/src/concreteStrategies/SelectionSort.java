package concreteStrategies;

import concreteStrategies.util.Trocar;

public class SelectionSort {
    public int[] ordenar(int[] v){
        for(int i=0;i<v.length;i++){
            int i_menor = i;
            for (int j = i+1; j < v.length-1; j++) {
                if(v[j] <= (v[i_menor]))
                    i_menor = j;
            }
            Trocar.trocar(v,i,i_menor);
        }
        return v;
    }
}
