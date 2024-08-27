package proxy;

import java.nio.file.AccessDeniedException;

public class ProxySegurancaServicoPedidos implements ServicoPedidoInterface{

    ServicoPedidosReal servicoPedidos;
    ControladorDeAcesso controlador = ControladorDeAcesso.getControleAcesso();

    public ProxySegurancaServicoPedidos(){
        this.servicoPedidos = new ServicoPedidosReal();
    }

    private void verificarSgurancaProxy() throws AccessDeniedException{

        if(!controlador.verificarAcessoPermitido()) throw new AccessDeniedException("Você não está logado, cheque os seus dados de login novamente!!");

    }

    @Override
    public boolean adicionar(long codigo, float valor) throws AccessDeniedException {
        
        verificarSgurancaProxy();
        return servicoPedidos.adicionar(codigo, valor);

    }

    @Override
    public boolean remover(long codigo) throws AccessDeniedException {

        verificarSgurancaProxy();
        return servicoPedidos.remover(codigo);

    }

    @Override
    public Pedido buscar(long codigo) throws AccessDeniedException {

        verificarSgurancaProxy();
        return servicoPedidos.buscar(codigo);

    }
}
