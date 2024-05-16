package diretor;

import interfacePartesMontagem.ConsultasBuilder;

public class DiretorConsultas{
    private ConsultasBuilder builder;

    public DiretorConsultas(ConsultasBuilder builder) {
        this.builder = builder;
    }

    public void construirConsultas(String[] colunas, String tabela, String condicao, String coluna) {
        builder.select(colunas)
               .from(tabela);
        
        if (condicao != null && !condicao.isEmpty()) {
            builder.where(condicao);
        }
        
        if (coluna != null && !coluna.isEmpty()) {
            builder.orderBy(coluna);
        }
    
    }
    
    public String getBuild(){
        return builder.build();
    }
}   