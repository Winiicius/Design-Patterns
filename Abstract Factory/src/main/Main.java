package main;

import pagamentos.ProcessadorPagamentoToolkit;
import pagamentos.fabricaPagamentos.FabricaPagamentos;
import pagamentos.pagseguro.FabricaPagamentosPagseguro;
import pagamentos.paypal.FabricaPagamentosPaypal;
import pagamentos.produtos.Cartao;
import pagamentos.produtos.Cliente;

public class Main {

	public static void main(String[] args) {
		usandoFabricaPagamentosPaypal();
		usandoFabricaPagamentosPagseguro();
	}

	public static void usandoFabricaPagamentosPaypal() {
		
		FabricaPagamentos fabricaPaypal = new FabricaPagamentosPaypal();

		Cliente cliente = fabricaPaypal.fabricarCliente();
		cliente.setCPF("123.456.993-22");
		
		Cartao cartao = fabricaPaypal.fabricarCartao();
		cartao.setCVV("150");
		cartao.setNumero("7204835286027102");
		cartao.setSenha("0101");

		ProcessadorPagamentoToolkit processador = new ProcessadorPagamentoToolkit(fabricaPaypal);
		processador.autorizarPagto(2000f, 0.020f, (short)10, cartao, cliente);

	}
	
	public static void usandoFabricaPagamentosPagseguro() {
		
		FabricaPagamentos fabricaPagseguro = new FabricaPagamentosPagseguro();

		Cliente cliente = fabricaPagseguro.fabricarCliente();
		cliente.setCPF("321.654.674-01");
		
		Cartao cartao = fabricaPagseguro.fabricarCartao();
		cartao.setCVV("220");
		cartao.setNumero("7204071238745102");
		cartao.setSenha("0690");

		ProcessadorPagamentoToolkit processador = new ProcessadorPagamentoToolkit(fabricaPagseguro);
		processador.autorizarPagto(5000f, 0.040f, (short)10, cartao, cliente);
	}
}
