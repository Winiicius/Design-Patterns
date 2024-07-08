package main;

import criptografia.FachadaCriptografia;

public class AplicacaoFacade {

	public static void main(String[] args) {
		usandoSubsistemaCriptografiaComFacade();
	}

	private static void usandoSubsistemaCriptografiaComFacade() {

		String stringBase = "ERA UMA VEZ";

		FachadaCriptografia fachada = new FachadaCriptografia();
		System.out.println(fachada.encriptarFraco(stringBase));
		System.out.println(fachada.encriptarMedio(stringBase));
		System.out.println(fachada.encriptarForte(stringBase));
		System.out.println(fachada.encriptarMuitoForte(stringBase));
		try{
			System.out.println(fachada.encriptarMuitissimoForte(stringBase));
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
