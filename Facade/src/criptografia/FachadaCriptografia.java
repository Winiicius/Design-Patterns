package criptografia;

public class FachadaCriptografia {

    private SHA256Encriptador  sha256Encriptador = new SHA256Encriptador();
    
    private ValidadorStringBase validador = new ValidadorStringBase();

    private EmbaralhadorString embaralhadorString;

	public String encriptarFraco(String string){
        MD5Encriptador md5Encriptador = new MD5Encriptador();
		return md5Encriptador.encriptar(string);
    }

    public String encriptarMedio(String string){
        SHAEncriptador shaEncriptador = new SHAEncriptador();
		return shaEncriptador.encriptar(string);
    }

    public String encriptarForte(String string){
        SHA256Encriptador  sha256Encriptador  = new SHA256Encriptador();
		return sha256Encriptador.encriptar(string);
    }

    public String encriptarMuitoForte(String string){
        embaralhadorString = new EmbaralhadorString(string);
		
		embaralhadorString.adicionarHorarioDoSistema();
		return sha256Encriptador.encriptar(embaralhadorString.toString());
    }
	
    public String encriptarMuitissimoForte(String string) throws Exception{

        embaralhadorString = new EmbaralhadorString(string);
        embaralhadorString.adicionarHorarioDoSistema();
        embaralhadorString.adicionarChaveDeEmbaralhamento("STRINGQUALQUER");

        String stringBaseEmbaralhada = embaralhadorString.toString();

        boolean validacao = validador.validarAlfanumericaMaiusculoMinusculo(stringBaseEmbaralhada);
        if(validacao) return sha256Encriptador.encriptar(string);
        throw new Exception("String Inválida");
    }
}
