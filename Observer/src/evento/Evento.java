package evento;

public class Evento {
	
	private String nomeEvento;
	
	private Object valorAntigo;
	
	private Object valorNovo;

	private Object originador;

	public Evento(Object originador, String nomeEvento, Object valorAntigo, Object valorNovo) {
		super();
		this.nomeEvento = nomeEvento;
		this.valorAntigo = valorAntigo;
		this.valorNovo = valorNovo;
		this.originador = originador;
	}

	public String getNomeEvento() {
		return nomeEvento;
	}

	public Object getValorAntigo() {
		return valorAntigo;
	}

	public Object getValorNovo() {
		return valorNovo;
	}
	
	public Object getOriginador() {
		return originador;
	}
}
