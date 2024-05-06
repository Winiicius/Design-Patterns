package observador;

import evento.Evento;

public interface Observador {

	public abstract void tratarEvento(Evento evento);
	
}
