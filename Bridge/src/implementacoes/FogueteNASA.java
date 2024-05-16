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
		System.out.println("NASA spaceship launched");

	}

	@Override
	public void aterissar() throws Exception {
		System.out.println("NASA spaceship landing");
	}

}
