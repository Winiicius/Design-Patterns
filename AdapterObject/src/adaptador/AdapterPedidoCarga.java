package adaptador;

import pedido.Endereco;
import pedido.Pedido;
import transporte.Carga;
import transporte.UnidadeMedida;

public class AdapterPedidoCarga extends Carga {

	private Pedido pedido;

	public AdapterPedidoCarga(Pedido pedido){
		this.pedido = pedido;
	}
	@Override
	public String getConteudo() {
		return pedido.getItensCompra().toString() + "\nTotal: " + pedido.getTotal();
	}
	@Override
	public Endereco getEnderecoEntrega() {
		return pedido.getEndereco();
	}
	@Override
	public float getValorReais() { 
		return pedido.getTotal();
	}
	@Override
	public String getIdentificadorRastreio() {
		return pedido.getIdentificadorRastreio();
	}
	@Override
	public UnidadeMedida getUnidadeMedida() {
		return UnidadeMedida.CENTIMETROS;
	}
	public Pedido getPedido() {
		return pedido;
	}
}