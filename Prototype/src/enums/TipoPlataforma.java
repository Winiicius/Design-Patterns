package enums;

public enum TipoPlataforma {
    CANO("Cano"),
    CHAO("Chao");

    private String descricao;

    TipoPlataforma(String descricao){
        this.descricao = descricao;
    }

    @Override
	public String toString() {
		return descricao;
	}

    public String getDescricao(){
        return this.descricao;
    }
	
	public static TipoPlataforma of(String descricao) {
		for(TipoPlataforma tipo: TipoPlataforma.values()) {
			if(tipo.getDescricao().equals(descricao))
				return tipo;
		}
		return null;
	}

}
