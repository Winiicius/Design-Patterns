package abstracoes;

import implementacoes.FogueteBridge;

/** 
 * TODO/OK BRIDGE.07.3
 * 1. Implemente os m�todos desta classe. Se baseie nas determina��es 
 * dispostas no diagrama UML de classes fornecido neste projeto.
 */
public class PlataformaFogueteTrajetoria extends PlataformaFoguete {

	public PlataformaFogueteTrajetoria(FogueteBridge fogueteBridge) {
		super(fogueteBridge);
	}

	public void simularMudancaTrajetoria(double angulo) throws Exception{
		foguete.mudarTrajetoria(angulo);
	}

}
