package transporte;
import java.util.ArrayList;
import java.util.List;

public class RotaTransporte {

	private List<Carga> cargas = new ArrayList<Carga>();
	
	public void addCarga(Carga carga) {
		cargas.add(carga);
	}
	
	public float calcularICMSCarga(String identificadorRastreio) {
		for (Carga carga : cargas) {
			if (carga.getIdentificadorRastreio().equals(identificadorRastreio))
				return carga.getValorReais()*0.3f; //aplica ICMS de 30% sobre a carga
		}
		return 0;
	}
	
	public String mostrarCargas() {
		StringBuffer stringBuffer = new StringBuffer();
		int i = 1;
		for (Carga carga : cargas) {
			stringBuffer.append("------> Carga "+ i + ": ID " + carga.getIdentificadorRastreio() + "\n");
			stringBuffer.append("Conteúdo: " + carga.getConteudo());
			stringBuffer.append("\n");
			stringBuffer.append("Valor: " + carga.getValorReais() + "R$");
			stringBuffer.append("\n");
		}
		return stringBuffer.toString();
	}
}
