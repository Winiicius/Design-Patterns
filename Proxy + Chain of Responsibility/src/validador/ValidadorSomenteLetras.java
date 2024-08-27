package validador;

public class ValidadorSomenteLetras extends ValidadorLoginChain {
    
    @Override
    public boolean avaliar(String login){
        if(login.matches("[a-z A-Z]*")) return super.avaliar(login);
        return false;
    }
    
}
