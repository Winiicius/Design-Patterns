package pagamentos.pagseguro;
import java.util.Date;

import encriptador.Encriptador;
import pagamentos.produtos.Cartao;
import pagamentos.produtos.Cliente;
import pagamentos.produtos.Loja;
import pagamentos.produtos.Transacao;

public class TransacaoPagseguro implements Transacao {
    
    private CartaoPagseguro cartao;
	private ClientePagseguro cliente;
	private LojaPagseguro loja;
	private float valor;
	private float juros;
	private short parcelas;
	private boolean cancelada;

	@Override
	public void setCartao(Cartao cartao) {
		if (cartao instanceof CartaoPagseguro) {
			this.cartao = (CartaoPagseguro) cartao;
		} else {
			System.out.println("Cartao incompativel para pagseguro.com");
		}
	}

	@Override
	public void setCliente(Cliente cliente) {
		if (cliente instanceof ClientePagseguro) {
			this.cliente = (ClientePagseguro) cliente;
		} else {
			System.out.println("Cliente incompativel para pagseguro.com");
		}
	}

	@Override
	public void setLoja(Loja loja) {
		if (loja instanceof LojaPagseguro) {
			this.loja = (LojaPagseguro) loja;
		}
	}

	@Override
	public void setValor(float valor) {
		if (valor > 0) {
			this.valor = valor;
		}
	}

	@Override
	public void setJuros(float juros) {
		if (juros > 0) {
			this.juros = juros;
		}
	}

	@Override
	public void setParcelas(short parcelas) {
		if (parcelas > 0) {
			this.parcelas = parcelas;
		}
	}
	
	@Override
	public Cartao getCartao() {
		return this.cartao;
	}

	@Override
	public Cliente getCliente() {
		return this.cliente;
	}

	@Override
	public Loja getLoja() {
		return this.loja;
	}

	@Override
	public float getValor() {
		return this.valor;
	}

	@Override
	public float getJuros() {
		return this.juros;
	}

	@Override
	public short getParcelas() {
		return this.parcelas;
	}

	@Override
	public boolean autorizar() {
		if (this.valor <= 0) {
			System.out.println("Transacao com valor menor igual a zero nao pode sere enviada para pagseguro.com");
			return false;
		}
		System.out.println("Enviando transacao para pagseguro.com");
		System.out.println(serialize());
		System.out.println("chave MD5");
		System.out.println(encriptar(serialize()));
		return true;
	}

	@Override
	public boolean cancelar() {
		if (!this.cancelada) {
			this.cancelada = true;
			System.out.println("Enviando transacao para pagseguro.com");
			System.out.println(serialize());
			System.out.println("chave MD5");
			System.out.println(encriptar(serialize()));
		} else
			System.out.println("Transacao ja cancelada e nao pode ser enviada para pagseguro.com");
			
		return false;
	}
	
	private String serialize() {
		//retorna representando como um objeto XML
		return "<transacao>" + 
                "\n   <cartao>" +
                "\n       <numero>" + this.cartao.getNumero() + "</numero>" +
                "\n       <cvv>" + this.cartao.getCVV() + "</cvv>" +
                "\n   </cartao>" +
                "\n   <cliente>" +
                "\n       <senha>" + this.cartao.getSenha() + "</senha>" +
                "\n       <cpf>" + this.cliente.getCPF() + "</cpf>" +
                "\n   </cliente>" +
                "\n   <estabelecimento>" + this.loja.getCodigo() + "</estabelecimento>" +
                "\n   <compra>" +
                "\n       <valor>" + this.valor + "</valor>" +
                "\n       <parcelas>" + this.parcelas + "</parcelas>" +
                "\n       <juros>" + this.juros + "</juros>" +
                "\n       <data>" + new Date().getTime() + "</data>" +
                "\n   </compra>" +
                "\n   <modo>" + ((this.cancelada)? "cancel" : "new") +"</modo>" + 
               "\n</transacao>";
	}
	
	private String encriptar(String valor) {
		return Encriptador.encriptar(valor, "MD5");
	}
}
