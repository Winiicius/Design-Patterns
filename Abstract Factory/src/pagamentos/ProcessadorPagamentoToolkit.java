package pagamentos;

import pagamentos.fabricaPagamentos.FabricaPagamentos;
import pagamentos.produtos.Cartao;
import pagamentos.produtos.Cliente;
import pagamentos.produtos.Loja;
import pagamentos.produtos.Transacao;

public class ProcessadorPagamentoToolkit {

    private FabricaPagamentos fabrica;
    private static Loja loja;

	public ProcessadorPagamentoToolkit(FabricaPagamentos fabrica) {
        this.fabrica = fabrica;
		loja = fabrica.fabricarLoja();
		loja.setCodigo("1001");
	}
	
	public Transacao autorizarPagto(float valor, float juros, short parcelas, Cartao cartao, Cliente cliente) {
		Transacao transacao = null;
		if (cartao != null && cliente != null) {
			transacao = fabrica.fabricarTransacao();
			transacao.setCartao(cartao);
			transacao.setCliente(cliente);
			transacao.setJuros(juros);
			transacao.setLoja(loja);
			transacao.setParcelas(parcelas);
			transacao.setValor(valor);
			transacao.autorizar();
		} else {
			System.out.println("erro: transacao ou cliente ou cartao ou loja nao foram corretamente repassados");
		}
		return transacao;
	}
}
