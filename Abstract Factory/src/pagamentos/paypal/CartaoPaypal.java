package pagamentos.paypal;

import encriptador.Encriptador;
import pagamentos.produtos.Cartao;

public class CartaoPaypal implements Cartao {
	
	private String numero, senha, CVV;
	
	public String getNumero() {
		return this.numero;
	}

	public String getSenha() {
		return this.senha;
	}
	
	public String getCVV() {
		return this.CVV;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public void setSenha(String senha) {
		this.senha = encriptar(senha);
	}
	
	public void setCVV(String CVV) {
		this.CVV = CVV;
	}
	
	private String encriptar(String valor) {
		return Encriptador.encriptar(valor,"SHA-256");
	}

}
