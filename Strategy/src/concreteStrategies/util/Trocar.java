package concreteStrategies.util;

public class Trocar {
    public static void trocar(int[] v, int i, int j) {
        int aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }
}
