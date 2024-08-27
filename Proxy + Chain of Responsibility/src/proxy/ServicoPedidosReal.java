package proxy;

import java.util.ArrayList;
import java.util.List;

public class ServicoPedidosReal implements ServicoPedidoInterface{

	List<Pedido> pedidos = new ArrayList<Pedido>();
	
	public boolean adicionar(long codigo, float valor) {
		for (Pedido pedido : pedidos) {
			if (pedido.getCodigo() == codigo) 
				return false;
		}
		Pedido pedido = new Pedido(codigo, valor);
		pedidos.add(pedido);
		return true;
	}
	
	public boolean remover(long codigo) {
		Pedido aBuscar = buscar(codigo);
		if (aBuscar != null)  {
			pedidos.remove(aBuscar);
			return true;
		}
		return false;
	}
	
	public Pedido buscar(long codigo) {
		Pedido aBuscar = null;
		for (Pedido pedido : pedidos) {
			if (pedido.getCodigo() == codigo) {
				aBuscar = pedido;
				break;
			}
		}
		return aBuscar;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}
}



