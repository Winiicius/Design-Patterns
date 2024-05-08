package composite;

// Poderia herdar de "ItemSistemaArquivos", mas teria que implementar os métodos novamente
// Herda de Pasta, aproveitando os métodos já implementados
public class ArquivoCompactado extends Pasta{

    public ArquivoCompactado(String nome) {
        super(nome + ".zip");
    }

}
