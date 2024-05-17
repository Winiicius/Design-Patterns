package implementacoes;

public abstract class FogueteBridge {

	public abstract void autoDestruir();

	public abstract void desacoplar();

	public abstract boolean checar();

	public abstract void decolar();
	
	public abstract void mudarTrajetoria(double angulo);
	
	public void aterissar() throws Exception {
		throw new Exception("Esse Foguete não pode aterissar");
	}
}
