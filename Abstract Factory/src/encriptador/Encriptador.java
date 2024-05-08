package encriptador;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Encriptador {
    
    public static String encriptar(String valor, String algoritmoCriptografico){
        MessageDigest digest;
		try {
			digest = MessageDigest.getInstance(algoritmoCriptografico);
			byte[] hash = digest.digest(valor.getBytes(StandardCharsets.UTF_8));
			return new StringBuffer().append(hash).toString();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return null;
    }

}
