package pagamentos.paypal;

import pagamentos.fabricaPagamentos.FabricaPagamentos;
import pagamentos.produtos.*;

public class FabricaPagamentosPaypal extends FabricaPagamentos{

    @Override
    public Cliente fabricarCliente() {
        return new ClientePaypal();
    }

    @Override
    public Cartao fabricarCartao() {
        return new CartaoPaypal();
    }

    @Override
    public Loja fabricarLoja() {
        return new LojaPaypal();
    }

    @Override
    public Transacao fabricarTransacao() {
        return new TransacaoPaypal();
    }
    
}
