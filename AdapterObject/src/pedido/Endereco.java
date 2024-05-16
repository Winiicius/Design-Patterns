package pedido;

public class Endereco {

	public Endereco(String logradouro, String cidade, String bairro, String CEP){
		this.logradouro = logradouro;
		this.cidade = cidade;
		this.bairro = bairro;
		this.CEP = CEP;
	}

	private String logradouro;
	
	private String cidade;
	
	private String bairro;
	
	private String CEP;

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}
}
