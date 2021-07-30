package padroes.observer;

public class Main {

	public static void main(String[] args) {
		
		Namorada namorada = new Namorada();
		
		Porteiro porteiro = new Porteiro();
		
		porteiro.registrarObservador(namorada);
		
		porteiro.registrarObservador(e -> System.out.println("Surpresa via lambda!"));
		porteiro.monitorar();

	}

}
