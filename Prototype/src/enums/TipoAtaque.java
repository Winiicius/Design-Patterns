package enums;

public enum TipoAtaque {
    PERSEGUIR("Perseguir"),
    ANDAR("Andar"),
    ATIRAR("Atirar");

    private String descricao;
	
	TipoAtaque(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	@Override
	public String toString() {
		return descricao;
	}
	
	public static TipoAtaque of(String descricao) {
		for(TipoAtaque tipo: TipoAtaque.values()) {
			if(tipo.getDescricao().equals(descricao))
				return tipo;
		}
		return null;
	}

}
