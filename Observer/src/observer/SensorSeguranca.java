package observer;

import evento.Evento;

public class SensorSeguranca extends Observavel {

	private String identificador;

	private boolean movimento;

	private boolean online;

	public String getIdentificador() {
		return identificador;
	}
	
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	
	public boolean isMovimento() {
		return movimento;
	}

	public boolean isOnline() {
		return online;
	}
	

	// Cria um evento com nome "movimento", passa o valor e notifica todos os observadores interessados
	public void setMovimento(boolean ativo) {
		Evento evento = new Evento(this.identificador, "movimento", this.movimento, ativo);
		notificarTodosObservadores(evento);
		this.movimento = ativo;
	}

	// Cria um evento com nome "online", passa o valor e notifica todos os observadores interessados
	public void setOnline(boolean online) {

		Evento evento = new Evento(this.identificador, "online", this.online, online);
		notificarTodosObservadores(evento);
		this.online = online;
	}
}
