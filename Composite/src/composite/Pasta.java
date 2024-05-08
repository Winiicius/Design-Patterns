package composite;
import java.util.HashSet;
import java.util.Set;

public class Pasta extends ItemSistemaArquivos {

	private Set<ItemSistemaArquivos> itens = new HashSet<>();

	public Pasta(String nome) {
		super(nome);
	}
	
	public void remove(ItemSistemaArquivos item) {
		itens.remove(item);
		item.setItemPai(null);
	}
	
	public ItemSistemaArquivos[] getItens() {
		return itens.toArray(new ItemSistemaArquivos[0]);
	}
	
	@Override
	public int tamanhoEmBytes() {
		int tamanho = 0;
		for (ItemSistemaArquivos item : itens) {
			tamanho += item.tamanhoEmBytes();
		}
		return tamanho + getNome().getBytes().length;
	}

	@Override
	public void deletar() throws Exception{

		if(getItemPai() == null) throw new Exception("Uma Pasta Raiz Não pode ser excluída");
			
		getItemPai().remove(this);
		System.out.println("Pasta '" + getNome() + "' apagada com sucesso!");
	}


	@Override
	public void mover(Pasta destino) {

		if(buscar(destino.getNome()) != null){
			throw new IllegalArgumentException();
		}
		
		getItemPai().remove(this);
		destino.add(this);
        
	}
	
	@Override
	public ItemSistemaArquivos buscar(String nome) {
		if(getNome().equals(nome)) return this;
		for (ItemSistemaArquivos itemSistemaArquivos : itens) {
			ItemSistemaArquivos resultado = itemSistemaArquivos.buscar(nome); 
			if(resultado != null){
				return resultado;
			}
		}
		return null;
	}
	
	public void add(ItemSistemaArquivos item) throws IllegalArgumentException {

		if(buscar(item.getNome()) != null) throw new IllegalArgumentException();

		item.setItemPai(this);
		itens.add(item);
	}
}
