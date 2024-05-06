package main;

import observador.CentralSeguranca;
import observador.ControleAlarme;
import observador.Mensageiro;
import observer.SensorSeguranca;

public class MainObserver {

	public static void main(String[] args) {
		
		// é criado um sensor(observado)
		SensorSeguranca sensor1 = new SensorSeguranca();
		sensor1.setIdentificador("SENSOR 1"); 
		
		// Aqui sã criadas as classes observadoras e são adicionadas como interessadas no objeto observado("SensorSeguranca")
		CentralSeguranca central = new CentralSeguranca();
		sensor1.adicionarObservador(central);

		Mensageiro mensageiro = new Mensageiro();
		sensor1.adicionarObservador(mensageiro);

		ControleAlarme controle = new ControleAlarme();
		sensor1.adicionarObservador(controle);
		
		simularEventos(sensor1); // Aqui simulamos os eventos(mudança de estado) no SensorSeguranca, ele notifica os interessados que tomam as açoes necessárias baseado no evento disparado

		// -----------------------------------------------------
		
		// Aqui fazemos a mesma coisa apenas criando um sensor novo
		SensorSeguranca sensor2 = new SensorSeguranca();
		sensor2.setIdentificador("SENSOR 2");
		sensor2.adicionarObservador(controle);
		sensor2.adicionarObservador(mensageiro);
		sensor2.adicionarObservador(central);
		simularEventos(sensor2);
	
	}

	// método que serve para ativar os eventos do observado
	private static void simularEventos(SensorSeguranca sensor) {
		sensor.setOnline(false);
		sensor.setMovimento(true);
		sensor.setOnline(true);
		sensor.setMovimento(false);
	}
}
