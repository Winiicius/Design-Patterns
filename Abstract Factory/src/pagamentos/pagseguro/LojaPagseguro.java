package pagamentos.pagseguro;

import pagamentos.produtos.Loja;

public class LojaPagseguro implements Loja {

    private String codigo;

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo + " pagseguro";
	}
}
