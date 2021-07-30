package padroes.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {

	private List<ChegadaAniversarianteObserver> observadores = new ArrayList<>();
	
	public void registrarObservador(ChegadaAniversarianteObserver o) {
		this.observadores.add(o);
	}
	
	public void monitorar() {
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		while(!"sair".equalsIgnoreCase(valor)) {
			System.out.println("Aniversariante chegou?");
			
			valor = entrada.nextLine();
			
			if("sim".equalsIgnoreCase(valor)) {
				
				// Criando o evento
				ChegadaAniversarianteEvent evento = new ChegadaAniversarianteEvent(new Date());
				
				// notificando o evento
				this.observadores.stream().forEach(o -> o.chegou(evento));
				
				valor = "sair";
			} else if(!"sair".equalsIgnoreCase(valor)) {
				System.out.println("Alarme falso!");
			}
			
		}
		
		entrada.close();
	}
}
