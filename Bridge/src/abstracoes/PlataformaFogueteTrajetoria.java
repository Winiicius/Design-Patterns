package abstracoes;

import implementacoes.FogueteBridge;


public class PlataformaFogueteTrajetoria extends PlataformaFoguete {

	public PlataformaFogueteTrajetoria(FogueteBridge fogueteBridge) {
		super(fogueteBridge);
	}

	public void simularMudancaTrajetoria(double angulo){
		foguete.mudarTrajetoria(angulo);
	}

}
