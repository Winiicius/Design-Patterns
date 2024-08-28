package concreteStrategies;

import concreteStrategies.util.Trocar;
import interfaceStrategy.AlgoritmoOrdenacaoStrategy;

public class HeapSort implements AlgoritmoOrdenacaoStrategy {

    public int[] ordenar(int[] v){
        int n = v.length;
        for(int i=n/2-1;i>=0;i--){
            teste_heap(v, n, i);
        }
        for(int i = n-1; i > 0; i--) {
            Trocar.trocar(v,0,i);
            teste_heap(v, i, 0);
        }
        
        return v;
    }

    public static void teste_heap(int[] v, int n, int i){
        int largest = i;
        int left = 2*i+1;
        int right = 2*i+2;
            if(left < n && v[left] >= (v[largest])){
                largest = left;
            }
            if(right < n && v[right] >= (v[largest])){
                largest = right;
            }
            if(largest != i){
                Trocar.trocar(v,i,largest);
                teste_heap(v, n, largest);
            }
    }
}
