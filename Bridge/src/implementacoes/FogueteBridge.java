package implementacoes;

public abstract class FogueteBridge {

	public abstract void autoDestruir();

	public abstract void desacoplar();

	public abstract boolean checar();

	public abstract void decolar();
	
	/**
	 * TODO/OK BRIDGE.01
	 * 
	 * 1. Esta classe compreende o equivalente ao supertipo que serve de ponte, o que uniformiza o 
	 * interfaceamento para classes concretas de implementa��es no padr�o Bridge. Para entender
	 * melhor as classes dispostas nesta pr�tica � altamente recomend�vel que voc� abra a figura
	 * {digrama-classes-uml.png} presente na pasta principal deste projeto. 
	 * 
	 * 2. Considere que qualquer das implementa��es desta ponte {FogueteBridge}, atuais
	 * ou futuras devem ser capazes de fornecer o m�todo {mudarTrajetoria()}. Com esse entendimento,
	 * seria mais conveniente tornar este m�todo abstrato, ou dever�amos deix�-lo como uma
	 * implementa��o default vazia/exce��o? Dependendo do que for escolhido, conserte erros 
	 * que possam aparecer em outras classes do projeto que dependem desta interface bridge 
	 * em suas implementa��es.
	 * 
	 * ---------- 
	 * [PERGUNTA A] 
	 * 1. Explique a decis�o tomada sobre como dispor este m�todo nesta classe, considerando
	 * atuais e futuras implementa��es desta ponte, com base na situa��o posta e conveni�ncias. 
	 * [
	 *  O método deve lançar uma exceção, pois, a implementação que decidirá
	 *  se vai implementá-lo ou não, se não for usá-lo, basta ignorar, se usá-lo
	 *  mas não possuir suporte pra isso, uma exceção é lançada avisando que não é possível
	 * ]
	 * ----------
	 * 
	 */
	public void mudarTrajetoria(double angulo) throws Exception{
		throw new Exception("It is not possible to change the route");
	}
	
	/**
	 * TODO/OK BRIDGE.02
	 * 
	 * 1. Somente o subtipo de implementa��o desta ponte correspondente a classe {FogueteNASA]
	 * deve ser capaz de aterrisar. Portanto, as demais n�o dar�o suporte, mas pode ser
	 * qu d�em ou que novos tipos de classes implementa��es disponibilizem esta opera��o.
	 * 
	 * 2. Considerando qualquer das implementa��es desta ponte {FogueteBridge}, atuais
	 * ou futuras, pela situa��o posta de como ele deve ocorrer,  seria mais conveniente 
	 * torn�-lo um m�todo abstrato, ou dever�amos deix�-lo como uma implementa��o default 
	 * vazia/exce��o? Dependendo do que for escolhido, conserte erros que possam aparecer 
	 * em outras classes do projeto que dependem desta interface bridge em suas implementa��es.
	 * 
	 * ----------
	 * [PERGUNTA B] 
	 * Explique a decis�o tomada sobre como dispor este m�todo nesta classe, considerando
	 * atuais e futuras implementa��es desta ponte, com base na situa��o posta e conveni�ncias. 
	 * [
	 *  O método deve lançar uma exceção, pois, é uma funcionalidade que nem todas as classes são
	 *  aptas a utilizar, e caso tentem, devem receber um aviso(exceção) que não é possível realizar 
	 *  tal funcionalidade.
	 * ]
	 * ----------
	 */
	public void aterissar() throws Exception {
		throw new Exception("This Spaceship Can't Land");
	}
}
