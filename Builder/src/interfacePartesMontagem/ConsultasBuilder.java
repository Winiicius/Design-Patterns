package interfacePartesMontagem;

public interface ConsultasBuilder {
    ConsultasBuilder select(String... columns);
    ConsultasBuilder from(String table);
    ConsultasBuilder where(String condition);
    ConsultasBuilder orderBy(String column);
    // Outros métodos para construção da consulta SQL
    
    String build();
}
