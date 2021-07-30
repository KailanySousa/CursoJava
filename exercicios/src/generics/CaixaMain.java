package generics;

public class CaixaMain {

	public static void main(String[] args) {
		Caixa<String> caixaA = new Caixa<>();
		
		caixaA.guardar("Olá");
		
		System.out.println(caixaA.abrir());
		
		Caixa<Double> caixaB = new Caixa<>();
		
		caixaB.guardar(3.8);
		
		System.out.println(caixaB.abrir());
	}
}
