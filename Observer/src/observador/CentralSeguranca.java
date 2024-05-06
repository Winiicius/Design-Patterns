package observador;

import evento.Evento;

public class CentralSeguranca implements Observador{

	public void chamarPolicia(String idSensorSeguranca) {
		System.out.println("chamando policia para sensor --> "+idSensorSeguranca);
	}

	public void chamarSegurancaPrivada(String idSensorSeguranca) {
		System.out.println("chamando seguranca privada para sensor --> "+idSensorSeguranca);
	}

	// Chama a polícia ou a segurança baseado nos valores do evento
	@Override
	public void tratarEvento(Evento evento) {
		String identificador = (String)evento.getOriginador();
		boolean valor = (boolean)evento.getValorNovo();
		if(evento.getNomeEvento().equals("movimento") && valor) chamarPolicia(identificador);
		if(evento.getNomeEvento().equals("online") && !valor) chamarSegurancaPrivada(identificador);
	}
}
