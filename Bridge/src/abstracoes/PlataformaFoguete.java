package abstracoes;

import implementacoes.FogueteBridge;

public class PlataformaFoguete {

	protected FogueteBridge foguete;

	public PlataformaFoguete(FogueteBridge fogueteBridge) {
		setFoguete(fogueteBridge);
	}

	public void setFoguete(FogueteBridge foguete) {
		this.foguete = foguete;
	}

	public void simularDecolagem() {
		foguete.checar();
		foguete.decolar();
		foguete.desacoplar();
	}

	public void simularAterrisagem(){
		foguete.checar();
		try{
			foguete.aterissar();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

	public void simularDiagnostico() {
		foguete.checar();
	}

	public void simularDiagnosticarFormatado() {
		foguete.checar();
	}
}
