package montadorConcreto;

import interfacePartesMontagem.ConsultasBuilder;

public class ConsultasSqlBuilder implements ConsultasBuilder{
    private StringBuilder query;

    public ConsultasSqlBuilder() {
        this.query = new StringBuilder();
    }

    @Override
    public ConsultasBuilder select(String... colunas) {
        query.append("SELECT ");
        query.append(String.join(", ", colunas));
        query.append("\n");
        return this;
    }

    @Override
    public ConsultasBuilder from(String tabela) {
        query.append(" FROM ");
        query.append(tabela);
        query.append("\n");
        return this;
    }

    @Override
    public ConsultasBuilder where(String condicao) {
        query.append(" WHERE ");
        query.append(condicao);
        query.append("\n");
        return this;
    }

    @Override
    public ConsultasBuilder orderBy(String coluna) {
        query.append(" ORDER BY ");
        query.append(coluna);
        return this;
    }

    @Override
    public String build() {
        return query.toString();
    }
}
