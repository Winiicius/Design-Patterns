package validador;

public abstract class ValidadorLoginChain {
    
    private ValidadorLoginChain proximoValidador;

    public boolean avaliar(String login){
        if(proximoValidador != null) return proximoValidador.avaliar(login);
        return true;
    }

    public ValidadorLoginChain getProximoValidador(){
        return proximoValidador;
    }

    public void setProximoValidador(ValidadorLoginChain proximoValidador){
        this.proximoValidador = proximoValidador;
    }
}
