package pagamentos.pagseguro;

import pagamentos.fabricaPagamentos.FabricaPagamentos;
import pagamentos.produtos.Cartao;
import pagamentos.produtos.Cliente;
import pagamentos.produtos.Loja;
import pagamentos.produtos.Transacao;

public class FabricaPagamentosPagseguro extends FabricaPagamentos {

    @Override
    public Cliente fabricarCliente() {
        return new ClientePagseguro();
    }
    @Override
    public Cartao fabricarCartao() {
        return new CartaoPagseguro();
    }

    @Override
    public Loja fabricarLoja() {
        return new LojaPagseguro();
    }

    @Override
    public Transacao fabricarTransacao() {
        return new TransacaoPagseguro();
    }
    
}
