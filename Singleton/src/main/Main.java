package main;

import java.time.LocalDate;

import logging.LoggerSingleton;
import model.FachadaCadastramentoPessoas;

public class Main {
	
	public static void main(String[] args) {
		
		LoggerSingleton logger = LoggerSingleton.getInstance();
		logger.registrarMensagemInformativa("VVV APLICACAO PRINCIPAL INICIADA!!!");			
		
		FachadaCadastramentoPessoas pessoaService = new FachadaCadastramentoPessoas();
		pessoaService.cadastrar("Fulano", LocalDate.of(1986, 5, 25));
		pessoaService.remover("Fulano");
		pessoaService.cadastrar("Cicrano", LocalDate.of(2020, 5, 25));
		pessoaService.remover("Cicrano");
		pessoaService.remover("Beltrano");
		
		logger.registrarMensagemInformativa("VVV APLICACAO PRINCIPAL ENCERRADA!!!");		
		
		logger.mostrarTodasMensagens();


		// RETORNO DO CÓDIGO ACIMA

		// 15/05/2024 17:50:55 [INFO] (15/05/2024 17:50:55) VVV APLICACAO PRINCIPAL INICIADA!!!
		// 15/05/2024 17:50:55 [INFO] (15/05/2024 17:50:55) PROCESSANDO CADASTRAMENTO DE PESSOA ---> nome: Fulano idade: 37
		// 15/05/2024 17:50:55 [DEBUG] (15/05/2024 17:50:55) CADASTRAMENTO DE PESSOA REALIZADO COM SUCESSO ---> nome: Fulano
		// 15/05/2024 17:50:55 [INFO] (15/05/2024 17:50:55) DESCADASTRAMENTO DE PESSOA REALIZADO COM SUCESSO ---> nome: Fulano
		// 15/05/2024 17:50:55 [INFO] (15/05/2024 17:50:55) PROCESSANDO CADASTRAMENTO DE PESSOA ---> nome: Cicrano idade: 3
		// 15/05/2024 17:50:55 [ERRO] (15/05/2024 17:50:55) CADASTRAMENTO DE PESSOA INVÁLIDO ---> nome: Cicrano. É menor de 18 anos
		// 15/05/2024 17:50:55 [ERRO] (15/05/2024 17:50:55) DESCADASTRAMENTO DE PESSOA INVÁLIDO ---> nome: Cicrano. Pessoa não encontrada
		// 15/05/2024 17:50:55 [ERRO] (15/05/2024 17:50:55) DESCADASTRAMENTO DE PESSOA INVÁLIDO ---> nome: Beltrano. Pessoa não encontrada
		// 15/05/2024 17:50:55 [INFO] (15/05/2024 17:50:55) VVV APLICACAO PRINCIPAL ENCERRADA!!!

	}
}
