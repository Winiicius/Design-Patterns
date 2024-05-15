package main;

import cliente.ExibidorGraficoSistemaDeArquivos;
import composite.Arquivo;
import composite.ArquivoCompactado;
import composite.Pasta;

public class Aplicacao {

	public static void main(String[] args) {
		
		// Criando algumas pastas
		Pasta pastaA = new Pasta("PASTA A");
		Pasta pastaB = new Pasta("PASTA B");
		Pasta pastaC = new Pasta("PASTA C");

		// Criando alguns Arquivos
		Arquivo arquivo1 = new Arquivo("ARQUIVO 1", ".pdf");
		Arquivo arquivo2 = new Arquivo("ARQUIVO 2", ".docx");
		Arquivo arquivo3 = new Arquivo("ARQUIVO 3", ".pptx");
		
		// Adicionando os arquivos 1,2 e 3 na "PASTA A"
		pastaA.add(arquivo1);
		pastaA.add(arquivo2);
		pastaA.add(arquivo3);

		// Criando mais Arquivos
		Arquivo arquivo4 = new Arquivo("ARQUIVO 4", ".pdf");
		Arquivo arquivo5 = new Arquivo("ARQUIVO 5", ".docx");
		Arquivo arquivo6 = new Arquivo("ARQUIVO 6", ".pptx");
		
		// Adicionando os arquivos 4,5 e 6 na "PASTA B"
		pastaB.add(arquivo4);
		pastaB.add(arquivo5);
		pastaB.add(arquivo6);
		
		// Criando mais Arquivos
		Arquivo arquivo7 = new Arquivo("ARQUIVO 7", ".pdf");
		Arquivo arquivo8 = new Arquivo("ARQUIVO 8", ".docx");
		Arquivo arquivo9 = new Arquivo("ARQUIVO 9", ".pptx");

		// Adicionando os arquivos 7,8 e 9 na "PASTA C"
		pastaC.add(arquivo7);
		pastaC.add(arquivo8);
		pastaC.add(arquivo9);
		
		// Adicionando a "PASTA C" na "PASTA B"
		pastaB.add(pastaC);
		
		// Adicionando a "PASTA B" na "PASTA A"
		pastaA.add(pastaB);
		
		// Criando a "PASTA D"
		Pasta pastaD = new Pasta("PASTA D");

		// Adicionando a "PASTA D" na "PASTA A"
		pastaA.add(pastaD);
		
		// Movendo a "PASTA D" para a "PASTA B"
		pastaB.mover(pastaD);

		// Aqui instanciamos um objeto do tipo "ArquivoCompactado" que é um Composite("container") para enriquecer a exemplificação do código
		ArquivoCompactado arquivoCompactado = new ArquivoCompactado("Compactado");

		// Adicionando a "PASTA A" no arquivo compactado
		arquivoCompactado.add(pastaA);
		
		// Essa é a forma como exibimos a pasta graficamente (pode mostrar o conteúdo de qualquer pasta)
		ExibidorGraficoSistemaDeArquivos.exibirItemJanelaSwing(arquivoCompactado);

		// RETORNO DO EXIBIDOR GRÁFICO
		
		// ->Compactado.zip (207 bytes)
		// 	  ->PASTA A (193 bytes)
		// 		->ARQUIVO 1.pdf (17 bytes)
		// 		->ARQUIVO 3.pptx (19 bytes)
		// 		->PASTA D (131 bytes)
		// 			->PASTA B (124 bytes)
		// 				->ARQUIVO 5.docx (19 bytes)
		// 				->PASTA C (62 bytes)
		// 					->ARQUIVO 9.pptx (19 bytes)
		// 					->ARQUIVO 7.pdf (17 bytes)
		// 					->ARQUIVO 8.docx (19 bytes)
		// 				->ARQUIVO 6.pptx (19 bytes)
		// 				->ARQUIVO 4.pdf (17 bytes)
		// 		->ARQUIVO 2.docx (19 bytes)
	}
}
