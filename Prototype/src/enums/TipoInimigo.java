package enums;

public enum TipoInimigo {
    GOOMBA("Goomba"),
    TARTARUGA("Tartaruga"),
    FANTASMA("Fantasma");

    private String descricao;
	
	TipoInimigo(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	@Override
	public String toString() {
		return descricao;
	}
	
    // Retorna ENUM pela descrição
	public static TipoInimigo of(String descricao) {
		for(TipoInimigo tipo: TipoInimigo.values()) {
			if(tipo.getDescricao().equals(descricao))
				return tipo;
		}
		return null;
	}
}
