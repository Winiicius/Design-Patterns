package enums;

public enum TipoElemento {
    OBSTACULO("Obstaculo"),
    PLATAFORMA("Plataforma"),
    INIMIGO("Inimigo");

    private String descricao;
	
	TipoElemento(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	@Override
	public String toString() {
		return descricao;
	}
	
	public static TipoElemento of(String descricao) {
		for(TipoElemento tipo: TipoElemento.values()) {
			if(tipo.getDescricao().equals(descricao))
				return tipo;
		}
		return null;
	}
}
