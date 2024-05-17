package implementacoes;

public class FogueteChina extends FogueteBridge {
	
	private boolean destruido = false;

	@Override
	public void autoDestruir() {
		System.out.println("Foguete Chinês destruido");
		this.destruido = true;
	}

	@Override
	public void desacoplar() {
		System.out.println("Foguete Chinês desacoplou");
	}

	@Override
	public boolean checar() {
		System.out.println("Diagnostico do Foguete Chinês: " + !this.destruido);
		return !this.destruido;
	}

	@Override
	public void decolar() {
		if (destruido) System.out.println("Não foi possível decolar o Foguete Chinês");
		else System.out.println("Foguete AEB decolou");
	}

	@Override
	public void mudarTrajetoria(double angulo) {
		System.out.printf("Mudando a trajetória do Foguete Chinês em: %.1f°\n",angulo);
	}
}
