package model;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import logging.LoggerSingleton;

public class FachadaCadastramentoPessoas {
	
	LoggerSingleton logger = LoggerSingleton.getInstance();
	
	Set<Pessoa> pessoasCadastradas = new HashSet<Pessoa>();

	// Adicionar pessoa
	public void cadastrar(String nome, LocalDate dataNasc) {
		Pessoa pessoa = new Pessoa(nome, dataNasc);

		String dadosInformativos = "PROCESSANDO CADASTRAMENTO DE PESSOA ---> nome: " + nome + " idade: " + pessoa.calcularIdade();
		logger.registrarMensagemInformativa(dadosInformativos);

		int idade = pessoa.calcularIdade();
		if(idade >= 18){
			pessoasCadastradas.add(pessoa);

			String dadosDebug = "CADASTRAMENTO DE PESSOA REALIZADO COM SUCESSO ---> nome: " + nome;
			logger.registrarMensagemDebug(dadosDebug);
		}else{
			String dadosErro = "CADASTRAMENTO DE PESSOA INVÁLIDO ---> nome: "+ nome +". É menor de 18 anos";
			logger.registrarMensagemErro(dadosErro);
		}
	}
	
	// Remover pessoa pelo nome
	public void remover(String nome) {
		for(Pessoa pessoa: pessoasCadastradas){
			if(pessoa.getNome().equals(nome)){
				pessoasCadastradas.remove(pessoa);
				String dadosCadastroRealizado = "DESCADASTRAMENTO DE PESSOA REALIZADO COM SUCESSO ---> nome: "+nome;
				logger.registrarMensagemInformativa(dadosCadastroRealizado);
				return;
			}
		}
		String dadosPessoaNaoEncontrada = "DESCADASTRAMENTO DE PESSOA INVÁLIDO ---> nome: " + nome+ ". Pessoa não encontrada";
		logger.registrarMensagemErro(dadosPessoaNaoEncontrada);
	}
}
