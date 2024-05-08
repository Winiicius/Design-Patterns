package ui;

import javax.swing.JFrame;

public class ModoAppDefault extends Aplicacao{

    @Override
    public JFrame fabricarJFrame() {
        return new JFrameDefault();
    }
    
}
