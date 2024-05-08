package composite;

public class Arquivo extends ItemSistemaArquivos {

	private String extensao;
	
	public Arquivo(String nome, String extensao) {
		super(nome);
		this.extensao = extensao;
	}
	
	@Override
	public String getNome() {
		return super.getNome()+this.extensao;
	}
	
	@Override
	public int tamanhoEmBytes() {
		return getNome().getBytes().length + getExtensao().getBytes().length;
	}

	public String getExtensao() {
		return extensao;
	}
	
	public void setExtensao(String extensao) {
		this.extensao = extensao;
	}

	@Override
	public void deletar() {
		getItemPai().remove(this);
		System.out.println("Arquivo '"+ getNome() + "' removido com sucesso!");
	}

	@Override
	public void mover(Pasta destino) {
		getItemPai().remove(this);
		destino.add(this);
	}

	@Override
	public ItemSistemaArquivos buscar(String nome) {
		return (nome != null && nome.equals(getNome()))? this : null;
	}
}
