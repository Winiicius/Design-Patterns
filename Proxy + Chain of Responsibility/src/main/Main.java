package main;

import java.nio.file.AccessDeniedException;

import javax.security.auth.login.LoginException;

import proxy.ControladorDeAcesso;
import proxy.ProxySegurancaServicoPedidos;
import proxy.ServicoPedidoInterface;

public class Main {

	public static void main(String[] args) {

		acessarServicoPedidos();
	}

	private static void acessarServicoPedidos() {
		
		ControladorDeAcesso controlador = ControladorDeAcesso.getControleAcesso(); 
		ServicoPedidoInterface servicoPedidosProxy = new ProxySegurancaServicoPedidos();
		
		// Exemplo em que o usuario não está cadastrado
		try {
			controlador.fazerLogin("user", "123");
		} catch (LoginException e) {
			System.out.println(e.getMessage());
		}
		// Console 
		// Login ou senha inválidos, user

		// Exemplo em que o login não possui apenas letras minúsculas
		try {
			controlador.fazerLogin("useR", "123");
		} catch (LoginException e) {
			System.out.println(e.getMessage());
		}
		// Console 
		// Login inválido( useR ). Apenas letras minúsculas são permitidas!!


		// Exemplo em que o login é validado e é feito adição, remoção e busca de pedidos
		try {
			controlador.fazerLogin("fulano", "123");
			servicoPedidosProxy.adicionar(918273, 100f);
			servicoPedidosProxy.adicionar(192837, 250f);
			System.out.println(servicoPedidosProxy.buscar(918273));
			servicoPedidosProxy.remover(192837);
			System.out.println(servicoPedidosProxy.buscar(192837));
			
		} catch (AccessDeniedException | LoginException e) {
			System.out.println(e.getMessage());
		}
		// Console
		// Pedido: 918273
		// Valor: 100.0
		// null	
		
	}
}
