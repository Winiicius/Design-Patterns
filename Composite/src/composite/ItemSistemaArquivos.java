package composite;

public abstract /* interface */ class ItemSistemaArquivos {
	
	//ficou aqui porque serve para conteineres e componentes simples.
	private String nome;
	
	//ficou aqui porque serve para conteineres e componentes simples.
	private Pasta itemPai;

	//ficou aqui porque se aplica para conteineres e componentes simples.
	//abstrato pois eh mais seguro haver implementacoes povidas somente por subtipos concretos desta classe.
	public abstract void mover(Pasta destino);
	
	//ficou aqui porque se aplica para conteineres e componentes simples.
	//abstrato pois eh mais seguro haver implementacoes povidas somente por subtipos concretos desta classe
	public abstract int tamanhoEmBytes();
	
	//ficou aqui porque se aplica para conteineres e componentes simples.
	//abstrato pois eh mais seguro haver implementacoes povidas somente por subtipos concretos desta classe
	public abstract ItemSistemaArquivos buscar(String nome);
	
	public ItemSistemaArquivos(String nome) {
		setNome(nome);
	}
	
	//implementado aqui porque se aplica para conteineres e componentes simples.
	public Pasta getItemPai() {
		return this.itemPai;
	}
	
	//implementado aqui porque se aplica para conteineres e componentes simples.
	void setItemPai(Pasta itemPai) {
		this.itemPai = itemPai;
	}
	
	//implementado aqui porque se aplica para conteineres e componentes simples.
	public String getNome() {
		return nome;
	}

	// ficou aqui apenas para deixar acessível pro cliente
	public void add(ItemSistemaArquivos item) throws IllegalArgumentException{
		throw new IllegalArgumentException("Não foi possível adicionar");
	}
	
	
	//implementado aqui porque se aplica para conteineres e componentes simples.
	public void setNome(String nome) throws IllegalArgumentException{
		if(this.getItemPai() != null){
			if(this.getItemPai().buscar(nome) != null) 
				throw new IllegalArgumentException();
			}	
		this.nome = nome;
	}
	
	// abstrato pois deve ser implementado tanto nos containeres e nos componentes simples
	public abstract void deletar() throws Exception; 
	
	// retorna null pois o tipo componente simples não suporta a implementação desse método
	public ItemSistemaArquivos[] getItens(){
		return null;
	};
}
