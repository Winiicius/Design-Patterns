package pagamentos.paypal;

import pagamentos.produtos.Loja;

public class LojaPaypal implements Loja {

	private String codigo;

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo + " paypal";
	}
	
}
