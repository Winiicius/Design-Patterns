package concreteStrategies;

import concreteStrategies.util.Trocar;
import interfaceStrategy.AlgoritmoOrdenacaoStrategy;

public class QuickSort implements AlgoritmoOrdenacaoStrategy{
    
    @Override
    public int[] ordenar(int[] vetor) {
        return ordenar(vetor, 0, vetor.length-1);       
    }
    public int[] ordenar(int[] v, int inicio, int fim){ 
        
        if(fim > inicio){
            int p = partition(v, inicio, fim);// retorna o ponto em que 
                                    // o pontDir e o pontEsq se cruzaram
            ordenar(v, inicio, p-1); // repete o processo dividindo o vetor
            ordenar(v, p+1, fim); // repete o processo dividindo o vetor
        }
        return v; // Retorna o vetor ORDENADO
    }
    public static int partition(int[] v,int inicio, int fim){ // método que organiza o vetor
        // int range = fim - inicio + 1; // define o limite do numero aleatorio a ser gerado
        // int pos = (int)(Math.random() * range) + inicio; // Gera o numero aleatório que vai ser o pivô
        // trocar(v, inicio, pos);
        
        // troca o valor aleatório escolhido com a primeira posição
        // para pivô como 1o elemento comentar as 3 linhas de cima
        // para pivô aleatório, descomentar as 3 linhas de cima 
        int pivo = v[inicio]; // aqui define qual será o pivô, 
        int pontEsq = inicio +1;
        int pontDir = fim;
        // duas variaveis criadas para percorrer o vetor, uma a partir 
        // do inicio, e outra do final
        while(pontEsq <= pontDir) { 
            
            while(pontEsq <= pontDir && pivo >= (v[pontEsq])) {
                // Se a pontaEsq ainda não cruzou com a pontDir &&
                // Se a pontEsq é >= ao pivô, ela avança uma posição, 
                pontEsq++;
                // Senão, guarda-se o indice do vetor
            }
            while(pontDir >= pontEsq && v[pontDir] > (pivo)) {
                // se a pontaDir ainda não cruzou com a pontEsq &&
                // Se a pontDir é <= ao pivô, ela "avança" uma posição, 
                pontDir--;
                // Senão, guarda-se o indice do vetor
            }
            if(pontEsq < pontDir) { // Se ainda não se cruzaram
                Trocar.trocar(v, pontDir, pontEsq); // troca-se as posições
                pontEsq++;
                pontDir--;
                // Avançam uma posição e continuam o mesmo processo,
                // Até se cruzarem
            }
        }
        Trocar.trocar(v, inicio, pontDir);// troca o inicio com o pontDir
        return pontDir; // retorna o pontDir, que é o ponto em que eles se cruzaram
    }
}
