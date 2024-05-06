package observador;

import evento.Evento;


public class Mensageiro implements Observador{

	private String nome;

	// Envia email baseado nos valores do evento
	@Override
	public void tratarEvento(Evento evento) {
		boolean valor = (boolean)evento.getValorNovo();
		if((evento.getNomeEvento().equals("movimento") && valor)) enviarEmail("Foi detectado um movimento");
		if(evento.getNomeEvento().equals("online")) 
			if(valor) enviarEmail("Sistema Online");
			else enviarEmail("Sistema Offline");
	}

	public Mensageiro() {
		this.nome = "Dono Fulano de Tal";
	}
	
	public String getNome() {
		return nome;
	}

	public void enviarEmail(String mensagem) {
		System.out.println("email enviado para ---> " + this.nome + " \nmensagem ---> " + mensagem);
	}
}
