import diretor.DiretorConsultas;
import interfacePartesMontagem.ConsultasBuilder;
import montadorConcreto.ConsultasSqlBuilder;

public class Main {
    public static void main(String[] args){
        ConsultasBuilder builder = new ConsultasSqlBuilder();
        DiretorConsultas diretor = new DiretorConsultas(builder);
        
        diretor.construirConsultas(new String[]{"nome", "idade", "email"}, "usuarios", "idade > 18", "nome");
        String query = diretor.getBuild();

        System.out.println("Query SQL: \n" + query);

        // RETORNO NO TERMINAL

        // Query SQL: 
        // SELECT name, age, email
        // FROM users
        // WHERE age > 18
        // ORDER BY name
    }
}
