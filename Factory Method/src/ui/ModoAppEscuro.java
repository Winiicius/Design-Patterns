package ui;

import javax.swing.JFrame;

public class ModoAppEscuro extends Aplicacao {

    @Override
    public JFrame fabricarJFrame() {
        return new JFrameEscuro();
    }
    
}
