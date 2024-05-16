package main;

import adaptador.AdapterPedidoCarga;
import pedido.Endereco;
import pedido.Pedido;
import pedido.Produto;
import transporte.Carga;
import transporte.RotaTransporte;
import transporte.UnidadeMedida;

public class AplicacaoAdapter {

	public static void main(String[] args) {
		AplicacaoAdapter.usandoClasseJaEsperadaPelaClassePreexistente(); 

		// RETORNO NO TERMINAL

		// ICMS: 60.000004
		// ------> Carga 1: ID BR4532
		// Conteúdo: Tênis
		// Valor: 200.0

		AplicacaoAdapter.usandoClasseIncompativelComAdaptadorNaClassePreexistente();

		// RETORNO NO TERMINAL

		// ------> Carga 1: ID BR634773
		// Conteúdo: [Nome: Violão
		// Peso: 1.7
		// Preço: 450.0
		// Altura: 102.0
		// Largura: 47.0
		// Profundidade: 13.0
		// Quantidade: 1
		// Sub Total: 450.0
		// ----------------
		// , Nome: Tênis Nike
		// Peso: 0.5
		// Preço: 300.0
		// Altura: 33.0
		// Largura: 21.0
		// Profundidade: 12.0
		// Quantidade: 1
		// Sub Total: 300.0
		// ----------------
		// , Nome: Palheta Violão
		// Peso: 0.1
		// Preço: 7.0
		// Altura: 10.0
		// Largura: 10.0
		// Profundidade: 10.0
		// Quantidade: 7
		// Sub Total: 49.0
		// ----------------
		// ]
		// Total: 799.0
		// Valor: 799.0R$

		// ICMS: 239.70001
		// Total Pedidos + ICMS: 1038.7


	}

	public static void usandoClasseJaEsperadaPelaClassePreexistente() {
		
		RotaTransporte rotaTransporte = new RotaTransporte();

		Carga carga = new Carga();

		Endereco enderecoEntrega = new Endereco("Rua da Felicidade", "São Paulo", "Centro", "58520-000");
		
		carga.setIdentificadorRastreio("BR4532");
		carga.setConteudo("Tênis");
		carga.setUnidadeMedida(UnidadeMedida.METROS);
		carga.setAltura(0.50f);
		carga.setLargura(0.70f);
		carga.setProfundidade(0.20f);
		carga.setPesoKg(0.500f);
		carga.setValorReais(200);
		carga.setEnderecoEntrega(enderecoEntrega);

		rotaTransporte.addCarga(carga);

		System.out.println("ICMS: " + rotaTransporte.calcularICMSCarga(carga.getIdentificadorRastreio()));
		System.out.println(rotaTransporte.mostrarCargas());
	}

	public static void usandoClasseIncompativelComAdaptadorNaClassePreexistente() {

		RotaTransporte rotaTransporte = new RotaTransporte();

		Produto violao = new Produto("Violão", 1.7f,new float[]{102,47,13}, 450f);
		Produto tenis = new Produto("Tênis Nike",0.500f,new float[]{33,21,12}, 300);
		Produto palhetaViolao = new Produto("Palheta Violão", 0.10f, new float[]{10,10,10}, 7f);

		Pedido pedido = new Pedido();

		pedido.criarItemCompra(1,450, violao );
		pedido.criarItemCompra(1,300,tenis );
		pedido.criarItemCompra(7,7,palhetaViolao);

		pedido.setIdentificadorRastreio("BR634773");
		
		rotaTransporte.addCarga(new AdapterPedidoCarga(pedido));

		System.out.println(rotaTransporte.mostrarCargas());

		float icms = rotaTransporte.calcularICMSCarga(pedido.getIdentificadorRastreio());

		System.out.println("ICMS: " + icms);
		System.out.println("Total Pedidos + ICMS: " + (icms + pedido.getTotal()));

	
//		 *  Classe PREEXISTENTE: RotaTransporte
//		 *  Classe IMPOSTA PELA PREEXISTENTE: Carga
	}

}
