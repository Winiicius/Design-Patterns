package main;

import abstracoes.PlataformaFogueteDestrutivel;
import abstracoes.PlataformaFogueteTrajetoria;
import abstracoes.PlataformaFoguete;
import implementacoes.FogueteAEB;
import implementacoes.FogueteBridge;
import implementacoes.FogueteChina;
import implementacoes.FogueteNASA;

public class Aplicacao {

	public static void main(String[] args) {

		/** 
		 * TODO/OK BRIDGE.05.1
		 * 1. Comente a chamada dos demais m�todos anteriores/posteriores a este.
		 * 2. Descomente este para executar ele e analisar em separado.
		 */
		// usandoAbstracaoDefaultPlataformaFogueteComVariasImplementacoesFoguete();



		/** 
		 * TODO/OK BRIDGE.06.1
		 * 1. Comente a chamada dos demais m�todos anteriores/posteriores a este.
		 * 2. Descomente este para executar ele e analisar em separado.
		 */
		// usandoAbstracaoAutodestrutivelPlataformaFogueteComVariasImplementacoesFoguete();



		/** 
		 * TODO/OK BRIDGE.07.1
		 * 1. Comente a chamada dos demais m�todos anteriores/posteriores a este.
		 * 2. Descomente este para executar ele e analisar em separado.
		 */
		usandoAbstracaoTrajetoriaPlataformaFogueteComVariasImplementacoesFoguete();

	}

	private static void usandoAbstracaoDefaultPlataformaFogueteComVariasImplementacoesFoguete() {
		FogueteBridge fogueteBridge = new FogueteAEB();
		PlataformaFoguete plataformaDefault = new PlataformaFoguete(fogueteBridge);
		plataformaDefault.simularDiagnostico();
		plataformaDefault.simularDiagnosticarFormatado();
		try {
			plataformaDefault.simularAterrisagem();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		plataformaDefault.simularDecolagem();
		/** 
		 * TODO/OK BRIDGE.05.2
		 * 1. Verifique se as sa�das na console est�o como esperado para a implementa��o 
		 * de foguete selecionada at� este ponto do c�digo deste m�todo.
		 */


		fogueteBridge = new FogueteChina();
		plataformaDefault.setFoguete(fogueteBridge);
		plataformaDefault.simularDiagnostico();
		plataformaDefault.simularDiagnosticarFormatado();
		try {
			plataformaDefault.simularAterrisagem();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		plataformaDefault.simularDecolagem();
		/** 
		 * TODO/OK BRIDGE.05.3
		 * 1. Verifique se as sa�das na console est�o como esperado para a implementa��o 
		 * de foguete selecionada at� este ponto do c�digo deste m�todo.
		 */

		fogueteBridge = new FogueteNASA();
		plataformaDefault.setFoguete(fogueteBridge);
		plataformaDefault.simularDiagnostico();
		plataformaDefault.simularDiagnosticarFormatado();
		try {
			plataformaDefault.simularAterrisagem();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		plataformaDefault.simularDecolagem();
		/** 
		 * TODO/OK BRIDGE.05.4
		 * 1. Verifique se as sa�das na console est�o como esperado para a implementa��o 
		 * de foguete selecionada at� este ponto do c�digo deste m�todo.
		 * 
		 * ----------
		 * [PERGUNTA E]
		 * ----------
		 * Foi possi�vel combinar objetos abstra��o com objetos implementados por provedores
		 * diferentes e vice-versa? Explique isso ressaltando o mecanismo chave do padr�o Bridge.
		 * [
		 *  Sim, é possível combinar ambos, O mecanismo chave do Bridge é separar a abstração da
		 *  implementação, permitindo que ambas possam variar independentemente uma da outra.
		 * ]
		 */

	}

	private static void usandoAbstracaoAutodestrutivelPlataformaFogueteComVariasImplementacoesFoguete() {
		FogueteBridge fogueteBridge = new FogueteAEB();
		PlataformaFogueteDestrutivel plataformaDestrutivel= new PlataformaFogueteDestrutivel(fogueteBridge);
		plataformaDestrutivel.simularDiagnostico();
		plataformaDestrutivel.simularDiagnosticarFormatado();
		try {
			plataformaDestrutivel.simularAterrisagem();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		plataformaDestrutivel.simularDecolagem();
		plataformaDestrutivel.simularDestruicao();
		/** 
		 * TODO/OK BRIDGE.06.1
		 * 1. Verifique se as sa�das na console est�o como esperado para a implementa��o 
		 * de foguete selecionada at� este ponto do c�digo deste m�todo.
		 */

		fogueteBridge = new FogueteChina();
		plataformaDestrutivel.setFoguete(fogueteBridge);
		plataformaDestrutivel.simularDiagnostico();
		plataformaDestrutivel.simularDiagnosticarFormatado();
		try {
			plataformaDestrutivel.simularAterrisagem();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}		
		plataformaDestrutivel.simularDecolagem();
		plataformaDestrutivel.simularDestruicao();
		/** 
		 * TODO/OK BRIDGE.06.2
		 * 1. Verifique se as sa�das na console est�o como esperado para a implementa��o 
		 * de foguete selecionada at� este ponto do c�digo deste m�todo.
		 */

		fogueteBridge = new FogueteNASA();
		plataformaDestrutivel.setFoguete(fogueteBridge);
		plataformaDestrutivel.simularDiagnostico();
		plataformaDestrutivel.simularDiagnosticarFormatado();
		try {
			plataformaDestrutivel.simularAterrisagem();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}		
		plataformaDestrutivel.simularDecolagem();
		plataformaDestrutivel.simularDestruicao();
		/** 
		 * TODO/OK BRIDGE.06.3
		 * 1. Verifique se as sa�das na console est�o como esperado para a implementa��o 
		 * de foguete selecionada at� este ponto do c�digo deste m�todo.
		 * 
		 * ----------
		 * [PERGUNTA F]
		 * Nesta classe, que simula diversos usos combinados de abstra��es e implementa��es
		 * do padr�o Bridge, este m�todo j� escolheu o objeto abstra��o {PlataformaFogueteDestrutivel}
		 * para us�-lo, combinando-o com objetos de implementa��o diversos, num primeiro momento.
		 * 
		 * Hipoteticamente, vamos imaginar uma troca de um objeto implementa��o sobre esse c�digo cliente
		 * j� realizado. Se mud�ssemos este c�digo cliente para que estabelecesse uma ponte
		 * com uma implementa��o {FogueteJapao} no lugar de {FogueteChina}, essa mudan�a geraria 
		 * um esforco simples (contorn�vel) de mudarmos apenas a linha de c�digo 
		 * correspondente no c�digo cliente? Explique.
		 * [
		 *  Sim, bastaria mudar a instanciação do objeto nada mais, pois, a chamada dos métodos é feita através
		 *  da classe PlataformaFoguete, e usa a ponte para chamar o objeto implementação, sem ao menos conhecê-lo.
		 * ]
		 * ----------
		 */
	}


	private static void usandoAbstracaoTrajetoriaPlataformaFogueteComVariasImplementacoesFoguete() {
		FogueteBridge fogueteBridge = new FogueteAEB();

		/** 
		 * TODO/OK BRIDGE.07.2
		 * 1.Implemente a classe de abstra��o de uso de foguetes de nome {PlataformaFogueteTrajetoria}, conforme
		 * determina a tarefa BRIDGE.07.3. Veja que esta classe j� existe mas est� vazia e que 
		 * usamos ela neste m�todo, vide a linha de c�digo abaixo.
		 */
		PlataformaFogueteTrajetoria plataformaTrajetoria= new PlataformaFogueteTrajetoria(fogueteBridge);
		plataformaTrajetoria.simularDiagnostico();
		plataformaTrajetoria.simularDiagnosticarFormatado();
		try {
			plataformaTrajetoria.simularAterrisagem();
			plataformaTrajetoria.simularDecolagem();
			plataformaTrajetoria.simularMudancaTrajetoria(45);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}		
		/** 
		 * TODO/OK BRIDGE.07.4
		 * 1. Verifique se as sa�das na console est�o como esperado para a implementa��o 
		 * de foguete selecionada at� este ponto do c�digo deste m�todo.
		 */

		fogueteBridge = new FogueteChina();
		plataformaTrajetoria.setFoguete(fogueteBridge);
		plataformaTrajetoria.simularDiagnostico();
		plataformaTrajetoria.simularDiagnosticarFormatado();
		try {
			plataformaTrajetoria.simularAterrisagem();
			plataformaTrajetoria.simularDecolagem();
			plataformaTrajetoria.simularMudancaTrajetoria(90d);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
		/** 
		 * TODO/OK BRIDGE.07.5
		 * 1. Verifique se as saidas na console estao como esperado para a implementa��o de foguete selecionadaVerifique se as sa�das na console est�o como esperado para a implementa��o 
		 * de foguete selecionada at� este ponto do c�digo deste m�todo.
		 */

		fogueteBridge = new FogueteNASA();
		plataformaTrajetoria.setFoguete(fogueteBridge);
		plataformaTrajetoria.simularDiagnostico();
		plataformaTrajetoria.simularDiagnosticarFormatado();
		try {
			plataformaTrajetoria.simularAterrisagem();
			plataformaTrajetoria.simularDecolagem();
			plataformaTrajetoria.simularMudancaTrajetoria(20d);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
		/** 
		 * TODO/OK BRIDGE.07.6
		 * 1. Verifique se as sa�das na console est�o como esperado para a implementa��o 
		 * de foguete selecionada at� este ponto do c�digo deste m�todo.
		 * 
		 * ----------
		 * [PERGUNTA G]
		 * Nesta classe, que simula diversos usos combinados de abstra��es e implementa��es
		 * do padr�o Bridge, este m�todo j� escolheu o objeto abstra��o {PlataformaFogueteTrajetoria}
		 * para us�-lo, combinando-o com objetos de implementa��o diversos, num primeiro momento.
		 * 
		 * Hipoteticamente, vamos imaginar uma troca do objeto abstra��o j� aplicado sobre esse 
		 * c�digo cliente. Se mud�ssemos ele para que esse objeto abstra��o passasse a ser agora
		 * {FogueteDestrutivel}, essa mudan�a geraria algum impacto em outro(s) ponto(s) deste 
		 * m�todo? Este impacto � maior do que o observado na simula��o de mudanca sugerida na 
		 * pergunta anterior? Considerando as constata��es j� obtidas, podemos dizer que 
		 * a mudan�a de objetos abstra��o no c�digo cliente tende a gerar impactos mais significativos, 
		 * do que a mudan�a de um objeto de implementa��o? Explique isso.
		 * [
		 *  Sim, sim, sim, a mudança da Abstração Refinada gera mais impacto porque o uso dela serve geralmente para
		 *  realizar uma função que nem todos os outros objetos implementações são capazes de fazer,
		 *  gerando assim, mais impacto, caso a abstração refinada seja alterada, aquela função deixa de "existir"
		 *  no código cliente atual, forçando-o a alterar o código onde essas funções haviam sido chamadas
		 * ]
		 * ----------
		 * 
		 * ----------
		 * [PERGUNTA H]
		 * Hipoteticamente, vamos agora imaginar uma outra mudan�a. Desta vez,ter�amos mudan�as 
		 * no c�digo interno (mas n�o na assinatura) de um m�todo qualquer de uma abstra��o ou de 
		 * uma implementa��o que j� est�o em uso por c�digos clientes da solu��o que aplicamos com o padr�o.
		 * Isso gera impacto nesses c�digos clientes? Explique isso.  
		 * [
		 *  Não, nenhum impacto, como cada foguete tem sua própria implementação, essas alterações apenas resultariam
		 *  em retornos(sysout) diferentes dos métodos chamados anteriormente,
		 * ]
		 * ----------
		 */
	}
}
