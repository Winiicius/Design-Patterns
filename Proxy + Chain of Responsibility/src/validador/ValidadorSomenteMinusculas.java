package validador;

public class ValidadorSomenteMinusculas extends ValidadorLoginChain {

    @Override
    public boolean avaliar(String login) {
        if(login.matches("[a-z]*")) return super.avaliar(login);
        return false;
    }
    
}
