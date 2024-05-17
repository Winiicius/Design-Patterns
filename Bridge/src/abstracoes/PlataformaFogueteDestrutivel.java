package abstracoes;

import implementacoes.FogueteBridge;

public class PlataformaFogueteDestrutivel extends PlataformaFoguete {

	public PlataformaFogueteDestrutivel(FogueteBridge foguete) {
		super(foguete);
	}

	public void simularDestruicao() {
		foguete.autoDestruir();
	}
}
