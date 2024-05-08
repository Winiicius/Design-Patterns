package ui;

import javax.swing.JFrame;

public class ModoAppNormal extends Aplicacao{

    @Override
    public JFrame fabricarJFrame() {
        return new JFrameClaro();
    }
    
}
