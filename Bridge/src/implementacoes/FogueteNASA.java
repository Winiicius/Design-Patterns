package implementacoes;

public class FogueteNASA extends FogueteBridge {
	
	private boolean descartado;

	@Override
	public void autoDestruir() {
		System.out.println("NASA spaceship destructed");
		this.descartado = true;
	}

	@Override
	public void desacoplar() {
		System.out.println("NASA spaceship uncoupled");

	}

	@Override
	public boolean checar() {
		System.out.println("NASA spaceship diagnostic: "+ !this.descartado);
		return !this.descartado;
	}

	@Override
	public void decolar() {
		if (descartado) System.out.println("NASA spaceship can't launch");
		else System.out.println("Nasa Spaceship launched");
	}

	@Override
	public void aterissar() throws Exception {
		System.out.println("NASA spaceship landing");
	}

	@Override
	public void mudarTrajetoria(double angulo) {
		System.out.printf("Changing the trajectory of the NASA Spaceship in %.1f°\n",angulo);
	}

}
