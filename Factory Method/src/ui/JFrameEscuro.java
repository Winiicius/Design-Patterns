package ui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;

import javax.swing.JFrame;

public class JFrameEscuro extends JFrame {

	private Color corFundo = new Color(0, 0, 0);
	private Color corFonte = new Color(79, 79, 79);

	public JFrameEscuro() {
		setExtendedState(MAXIMIZED_BOTH);
		setEsquemaCores(this);
	}

	@Override
	public Component add(Component comp) {
		if (comp instanceof Container) {
			for (Component filho : ((Container)comp).getComponents()) {
				setEsquemaCores(filho);
			}
		} 
		setEsquemaCores(comp);
		return super.add(comp);
	}

	public Component setEsquemaCores(Component comp) {

		comp.setBackground(corFundo);

		comp.setForeground(corFonte);
		return comp;
	}
}
