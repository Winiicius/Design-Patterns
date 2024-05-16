package implementacoes;

public class FogueteChina extends FogueteBridge {
	
	private boolean destruido = false;
		
	@Override
	public void autoDestruir() {
		System.out.println("中国火箭被摧毁");
		this.destruido = true;
	}

	@Override
	public void desacoplar() {
		System.out.println("中国火箭解耦");
		
	}

	@Override
	public boolean checar() {
		System.out.println("中国火箭被诊断");
		return !this.destruido;
	}

	@Override
	public void decolar() {
		System.out.println("中国火箭起飞");
	}
}
