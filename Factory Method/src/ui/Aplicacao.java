package ui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public abstract class Aplicacao {
	
	public void instalarListenerFechamento(JFrame janela) {
		janela.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public void instalarAreasDeLayout(JFrame janela) {
		JSplitPane split = new JSplitPane();
		split.setLeftComponent(new JPanel());
		split.setRightComponent(new JPanel());
		split.setDividerLocation(350);
		janela.add(split);
	}
	
	public JFrame iniciar() {
		JFrame janela = fabricarJFrame();
		
		instalarListenerFechamento(janela);
		instalarAreasDeLayout(janela);
		janela.setVisible(true);

		return janela;
	}
	
	// factory-method que deverá ser implementado por subclasses que entregarão um produto com new, que corresponda ao supertipo para produtos {JFrame}.
	public abstract JFrame fabricarJFrame();
	
}
