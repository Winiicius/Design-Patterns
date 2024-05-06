package observer;

import java.util.HashSet;
import java.util.Set;

import evento.Evento;
import observador.Observador;

public abstract class Observavel {
	
	private Set<Observador> observadoresRegistrados = new HashSet<>();
	
	public void adicionarObservador(Observador observer) {
		observadoresRegistrados.add(observer);
	}
	
	public void removerObservador(Observador observer) {
		observadoresRegistrados.remove(observer);
	}
	
	public void notificarTodosObservadores(Evento evento) {
		for(Observador observer: observadoresRegistrados){
			observer.tratarEvento(evento);
		}
	}
}
