package abstracoes;

import implementacoes.FogueteBridge;

/**
 * TODO/OK BRIDGE.03
 * 
 * 1. Entenda que esta classe representa o supertipo para abstra��es do padr�o Bridge.
 * 
 * 2. Implemente cada m�todo desta classe dispondo-lhes o uso de quaisquer
 * implementa��es de foguetes que correspondam ao supertipo estabelecido como ponte.  
 * Veja a as notas UML associadas a esta classe e as suas subclasses, no diagrama
 * fornecido.
 * 	
 * ----------
 * [PERGUNTA C]
 * Sendo esta classe considerada como uma classe de abstra��o para clientes do padr�o, 
 * pode-se dizer que ela fornece o "jeito default" (padr�o) para se disponibilizar
 * funcionalidades que usam objetos foguetes, mas que cujas implementa��es 
 * de suas classes s�o desenvolvidas e mantidas por provedores diferentes? 
 * Explique isso.
 * [
 *  Sim, pois, essa classe é a implementação default que os foguetes possuem, independente
 *  de onde eles são, ou de qualquer outra coisa, eles vão chamar esses métodos da 
 *  maneira que estão aqui, o que muda é a implementação de cada foguete, pois, cada
 *  foguete possui suas características individuais e devem implementar esses métodos
 *  da maneira que for for adequada pra eles.
 * ] 
 * ----------
 */
public class PlataformaFoguete {

	protected FogueteBridge foguete;
	
	public PlataformaFoguete(FogueteBridge fogueteBridge) {
		setFoguete(fogueteBridge);
	}

	public void setFoguete(FogueteBridge foguete) { // 
		this.foguete = foguete;
	}
	
	public void simularDecolagem() {
		foguete.checar();
		foguete.decolar();
		foguete.desacoplar();
	}

	public void simularAterrisagem() throws Exception {
		foguete.checar();
		foguete.aterissar();
	}

	public void simularDiagnostico() {
		foguete.checar();
	}

	public void simularDiagnosticarFormatado() {
		foguete.checar();
	}

}
