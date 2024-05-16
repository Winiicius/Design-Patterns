package implementacoes;

public class FogueteAEB extends FogueteBridge {

	private boolean eliminado;

	@Override
	public void autoDestruir() {
		System.out.println("Foguete AEB destruido");
		this.eliminado = true;
	}

	@Override
	public void desacoplar() {
		System.out.println("Foguete AEB desacoplou");

	}

	@Override
	public boolean checar() {
		System.out.println("diagnostico do Foguete AEB: " + !this.eliminado);
		return !this.eliminado;
	}

	@Override
	public void decolar() {
		System.out.println("Foguete AEB decolou");
	}

	@Override
	public void mudarTrajetoria(double angulo) { // método adicionado
		System.out.printf("Mudando a Trajetória em %.1f°\n",angulo);
	}

}
