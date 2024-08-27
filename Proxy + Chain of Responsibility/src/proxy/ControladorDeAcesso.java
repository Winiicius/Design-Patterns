package proxy;

import java.util.HashMap;

import javax.security.auth.login.LoginException;

import validador.ValidadorLoginChain;
import validador.ValidadorSomenteLetras;
import validador.ValidadorSomenteMinusculas;

public class ControladorDeAcesso {
	
	public static ControladorDeAcesso instancia = new ControladorDeAcesso();
	
	private ControladorDeAcesso() { 	
		logados.put("fulano", "123");
		logados.put("patterns", "456");
	}
	
	private String loginAtivo = null;
	
	public synchronized static ControladorDeAcesso getControleAcesso() {
		return instancia;
	}
	
	private HashMap<String,String> logados = new HashMap();
	
	public boolean verificarAcessoPermitido() {
		return this.loginAtivo != null;
	}
	
	public boolean validarLogin(String login) throws LoginException{
		ValidadorLoginChain validadorSomenteLetras = new ValidadorSomenteLetras();
		ValidadorLoginChain validadorSomenteMinusculas = new ValidadorSomenteMinusculas();
		validadorSomenteLetras.setProximoValidador(validadorSomenteMinusculas);

		boolean validou = validadorSomenteLetras.avaliar(login);
		if(!validou) throw new LoginException("Login inválido( " + login + " ). Apenas letras minúsculas são permitidas!!");
		return true;
	}

	public void fazerLogin(String login, String senha)throws LoginException {

			validarLogin(login);
			String conta = logados.get(login);
			this.loginAtivo = (conta != null)? ((conta.equals(senha))? login : null) : null;
			if(conta == null) throw new LoginException("Login ou senha inválidos, " + login);
		
	}
}
