package cliente;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import composite.ItemSistemaArquivos;

// Classe responsável por exibir as pastas em tela
public class ExibidorGraficoSistemaDeArquivos {

	public static void exibirItemJanelaSwing(ItemSistemaArquivos item) {
		
		JFrame frame = new JFrame();
		frame.setBounds(0, 0, 500, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
			String conteudo = formatarEmStringConteudoDoItem(item, 0);
			JTextArea textarea = new JTextArea(conteudo);
	
			frame.add(textarea);
			frame.setVisible(true);
	}

	// Formata em string o conteudo de cada item, com recuo de espacos em branco para cada nivel da hierarquia 
	public static String formatarEmStringConteudoDoItem(ItemSistemaArquivos item, int recuoExibicao){
		StringBuffer strBuffer = new StringBuffer();
		strBuffer.append("->");
		strBuffer.append(item.getNome());
		strBuffer.append(" (");
		strBuffer.append(item.tamanhoEmBytes());
		strBuffer.append(" bytes)\n");
		recuoExibicao = ++recuoExibicao*2;
		if (item.getItens() != null) {
			for (ItemSistemaArquivos itemFilho : item.getItens()) {
				for (int i = 0; i < recuoExibicao; i++) {
					strBuffer.append(" ");
				}

				if (itemFilho.getItens() != null) {
					strBuffer.append(formatarEmStringConteudoDoItem(itemFilho, recuoExibicao));
				} else {
					strBuffer.append("->");
					strBuffer.append(itemFilho.getNome());
					strBuffer.append(" (");
					strBuffer.append(itemFilho.tamanhoEmBytes());
					strBuffer.append(" bytes)\n");
				}
			}
		}
		return strBuffer.toString();
	}
}
