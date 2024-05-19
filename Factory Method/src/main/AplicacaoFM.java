package main;

import ui.Aplicacao;
import ui.ModoAppDefault;
import ui.ModoAppEscuro;
import ui.ModoAppNormal;

public class AplicacaoFM {

	
	public static void main(String[] args) {
		// Aplicacao janela = new ModoAppNormal();
		// Aplicacao janela = new ModoAppDefault();
		Aplicacao janela = new ModoAppEscuro();
		janela.iniciar();
	}
}
