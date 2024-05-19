package main;

import abstracoes.PlataformaFogueteDestrutivel;
import abstracoes.PlataformaFogueteTrajetoria;
import implementacoes.FogueteAEB;
import implementacoes.FogueteBridge;
import implementacoes.FogueteChina;
import implementacoes.FogueteNASA;

public class AplicacaoBridge {

	public static void main(String[] args) {

		usandoAbstracoesPlataformaFoguete();

	}
	
	private static void usandoAbstracoesPlataformaFoguete() {
		
		FogueteBridge fogueteBridge = new FogueteAEB();
		PlataformaFogueteTrajetoria plataformaTrajetoria = new PlataformaFogueteTrajetoria(fogueteBridge);

		// Usando Foguete AEB na Plataforma de Trajetória
		plataformaTrajetoria.simularDiagnostico();
		plataformaTrajetoria.simularDecolagem();
		plataformaTrajetoria.simularAterrisagem();		
		plataformaTrajetoria.simularMudancaTrajetoria(45);

		// RETORNO NO TERMINAL: 

		// diagnostico do Foguete AEB: true
		// diagnostico do Foguete AEB: true
		// Foguete AEB decolou
		// Foguete AEB desacoplou
		// diagnostico do Foguete AEB: true
		// Esse Foguete não pode aterissar
		// Mudando a trajetória do Foguete AEB em: 45,0°
		
		
		// Simulando com o foguete Chinês na Plataforma de Trajetória
		fogueteBridge = new FogueteChina();
		plataformaTrajetoria.setFoguete(fogueteBridge);
		plataformaTrajetoria.simularDiagnostico();
		plataformaTrajetoria.simularDecolagem();
		plataformaTrajetoria.simularAterrisagem();
		plataformaTrajetoria.simularMudancaTrajetoria(90d);

		// RETORNO NO TERMINAL

		// Diagnostico do Foguete Chinês: true
		// Diagnostico do Foguete Chinês: true
		// Foguete AEB decolou
		// Foguete Chinês desacoplou
		// Diagnostico do Foguete Chinês: true
		// Esse Foguete não pode aterissar
		// Mudando a trajetória do Foguete Chinês em: 90,0°
	

		// Simulando com o foguete da NASA na Plataforma Destrutível
		PlataformaFogueteDestrutivel plataformaDestrutivel = new PlataformaFogueteDestrutivel(fogueteBridge);
		fogueteBridge = new FogueteNASA();
		plataformaDestrutivel.setFoguete(fogueteBridge);
		plataformaDestrutivel.simularDiagnostico();
		plataformaDestrutivel.simularDecolagem();
		plataformaDestrutivel.simularAterrisagem();
		plataformaDestrutivel.simularDestruicao();
		plataformaDestrutivel.simularDecolagem();
		plataformaDestrutivel.simularDiagnosticarFormatado();

		// RETORNO NO TERMINAL:

		// NASA spaceship diagnostic: true
		// NASA spaceship diagnostic: true
		// Nasa Spaceship launched
		// NASA spaceship uncoupled
		// NASA spaceship diagnostic: true
		// NASA spaceship landing
		// NASA spaceship destructed
		// NASA spaceship diagnostic: false
		// NASA spaceship can't launch
		// NASA spaceship uncoupled
		// NASA spaceship diagnostic: false
	}
}
