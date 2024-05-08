package pagamentos.fabricaPagamentos;

import pagamentos.produtos.Cartao;
import pagamentos.produtos.Cliente;
import pagamentos.produtos.Loja;
import pagamentos.produtos.Transacao;

public abstract class FabricaPagamentos {

    public abstract Cliente fabricarCliente();
    public abstract Cartao fabricarCartao();
    public abstract Loja fabricarLoja();
    public abstract Transacao fabricarTransacao();
    
}