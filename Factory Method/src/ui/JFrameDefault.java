package ui;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;

public class JFrameDefault extends JFrame{
    private Color corFundo = new Color(255, 0, 127);
	private Color corFonte = new Color(0, 0, 0);
	
	public JFrameDefault() {
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
