package abstracoes;

import implementacoes.FogueteBridge;

public class PlataformaFogueteDestrutivel extends PlataformaFoguete {

	public PlataformaFogueteDestrutivel(FogueteBridge foguete) {
		super(foguete);
	}

	/**
	 * TODO/OK BRIDGE.04
	 * 
	 * 1.Esta classe equivale uma vers�o concreta do supertipo de 
	 * abstra��es do padr�o Bridge {PlataformaFoguete} e foi criada 
	 * para dispor opera��es j� definidas l� de um jeito diferente, por sobrescrita,
	 * ou para dispor opera��es adicionais para clientes que preferirem 
	 * ou precisarem de uma plataforma com servi�os que permitam aplicar a destrui��o
	 * em foguetes, qualquer que seja o desenvolvedor provedor deles.
	 *  
	 * 2. Implemente cada m�todo desta classe dispondo-lhes o uso de quaisquer
	 * implementa��es de foguetes que correspondam ao supertipo estabelecido como ponte.  
	 * Veja a as notas UML associadas a esta classe e as suas subclasses, no diagrama
	 * fornecido.
	 * 
	 * ----------
	 * [PERGUNTA D]
	 * ----------
	 * Sendo esta classe uma especializa��o de {PlataformaFoguete}, conforme
	 * apresentado, o c�digo dos metodos desta classe e de sua superclasse dependem de
	 * foguetes cuja implementa��o � escolhida pelo cliente que usar uma plataforma.
	 * Esta classe, a sua superclasse e futuras subclasses se acoplam com classes de foguetes 
	 * de tipo espec�fico? Com Bridgem, isso deve ser evitado ou encorajado e por qu�?
	 * [
	 *  Não, as classes abstratas/abstratasRefinadas se acoplam com a classe de implementação,
	 *  que nesse exemplo representa os "tipos" de foguetes, não se acoplando com foguetes
	 *  específicos, isso deve ser evitado, pois, a implementação dessa classe deve servir
	 *  para todos os tipos de foguete que quiserem implementá-la  
	 * ] 
	 */
	public void simularDestruicao() {
		foguete.autoDestruir();
	}
}
