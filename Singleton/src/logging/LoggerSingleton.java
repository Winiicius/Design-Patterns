package logging;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashSet;
import java.util.Set;

public class LoggerSingleton {

	private Set<String> mensagens = new LinkedHashSet<String>();
	private static LoggerSingleton intanciaLogger;
	private boolean interativo = false;
	
	private LoggerSingleton(){};

	public static LoggerSingleton getInstance(){
		if(intanciaLogger == null)
			intanciaLogger = new LoggerSingleton();
		
		return intanciaLogger;
	}

	public void registrarMensagemInformativa(String msg) {
		msg = "[INFO] ("+getDataHora()+") "+msg;
		this.mensagens.add(getDataHora()+" "+msg);
		if (interativo)
			System.out.println(msg);
	}

	public void registrarMensagemDebug(String msg) {
		msg = "[DEBUG] ("+getDataHora()+") "+msg;
		this.mensagens.add(getDataHora()+" "+msg);
		if (interativo)
			System.out.println(msg);
	}

	public void registrarMensagemErro(String msg) {
		msg = "[ERRO] ("+getDataHora()+") "+msg;
		this.mensagens.add(getDataHora()+" "+msg);
		if (interativo)
			System.out.println(msg);
	}

	public void mostrarMensagensInformativas() {
		for (String msg : this.mensagens) {
			if (msg.contains("[INFO]"))
				System.out.println(msg);
		}
	}

	public void mostrarMensagensDebug() {
		for (String msg : this.mensagens) {
			if (msg.contains("[DEBUG]"))
				System.out.println(msg);
		}
	}

	public void mostrarMensagensErro() {
		for (String msg : this.mensagens) {
			if (msg.contains("[ERRO]"))
				System.out.println(msg);
		}
	}

	public void mostrarTodasMensagens() {
		for (String msg : this.mensagens) {
			System.out.println(msg);
		}
	}

	public void setInterativo(boolean interativo) {
		this.interativo = interativo;
	}

	private String getDataHora() {
		LocalDateTime timestamp = LocalDateTime.now();
		return timestamp.format(DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss"));
	}


}
