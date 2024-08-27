package proxy;

import java.nio.file.AccessDeniedException;

public interface ServicoPedidoInterface {

    public boolean adicionar(long codigo, float valor) throws AccessDeniedException;
    public boolean remover(long codigo) throws AccessDeniedException;
    public Pedido buscar(long codigo) throws AccessDeniedException;
	
}
