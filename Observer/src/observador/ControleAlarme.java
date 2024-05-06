package observador;

import java.awt.Toolkit;

import evento.Evento;

public class ControleAlarme implements Observador{

	public  void dispararAlarme() {
		int i = 0;
		while (i<5) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Toolkit.getDefaultToolkit().beep();
			i++;
		}
	}

	public void pararAlarme() {
		int i = 0;
		while (i<3) {
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Toolkit.getDefaultToolkit().beep();
			i++;
		}
	}

	// Dispara alarme apenas se o evento for do tipo "movimento" e se for true
	@Override
	public void tratarEvento(Evento evento) {
		if(evento.getNomeEvento().equals("movimento")){
			boolean valor = (boolean)evento.getValorNovo();
			if(valor) dispararAlarme();
			else pararAlarme();
		}
	}
}
