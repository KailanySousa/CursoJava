package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		double f = 86;
		final double FATOR = 5.0/9.0;
		final int DIFERENCA = 32;
		
		double c = (f - DIFERENCA) * FATOR;
		System.out.println("Temperatura em Celsius = " + c);
		
		f = 0;
		c = (f - DIFERENCA) * FATOR;
		System.out.println("Temperatura em Celsius = " + c);
	}
}
