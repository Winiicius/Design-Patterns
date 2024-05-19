package main;

import pagamentos.ProcessadorPagamentoToolkit;
import pagamentos.fabricaPagamentos.FabricaPagamentos;
import pagamentos.pagseguro.FabricaPagamentosPagseguro;
import pagamentos.paypal.FabricaPagamentosPaypal;
import pagamentos.produtos.Cartao;
import pagamentos.produtos.Cliente;

public class MainAF {

	public static void main(String[] args) {
		usandoFabricaPagamentosPaypal();

		// RETORNO NO TERMINAL

		// Enviando transacao para paypal.com
		// transacao: {cartao: 7204835286027102150cliente.senha: [B@254989ffcliente.cpf: 123.456.993-22 paypal paypalestabelecimento: 1001 paypalcompra.valor: 2000.0compra.parcelas 10compra.juros0.02compra.data1715808661561modo: new}
		// chave SHA-256
		// [B@5ef04b5


		usandoFabricaPagamentosPagseguro();

		// RETORNO NO TERMINAL

		// Enviando transacao para pagseguro.com
		// <transacao>
		//   <cartao>
		// 	    <numero>7204071238745102</numero>
		// 	    <cvv>220</cvv>
		//   </cartao>
		//   <cliente>
		// 	    <senha>[B@4459eb14</senha>
		// 	    <cpf>321.654.674-01 pagseguro pagseguro</cpf>
		//   </cliente>
		//   <estabelecimento>1001 pagseguro</estabelecimento>
		//   <compra>
		// 	    <valor>5000.0</valor>
		// 	    <parcelas>10</parcelas>
		// 	    <juros>0.04</juros>
		// 	    <data>1715808661629</data>
		//   </compra>
		//   <modo>new</modo>
		// </transacao>
		// chave MD5
		// [B@6659c656
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
