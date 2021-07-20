package lambdas;

public class CalculoMain1 {

	public static void main(String[] args) {
	
		Calculo calculo = (double a, double b) -> { return a + b; };

		System.out.println(calculo.executar(3, 3));
		
		calculo = (a, b) -> a * b;
		
		System.out.println(calculo.executar(2, 3));
		
	}

}
