package fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
		
		double raio = 3.4;
		
		/* 
		 * utilizando o 'final' para declarar uma variavel como constante
		 * como padrão, para constantes, utilizando letras maiusculas
		 * para definir seu nome
		 */
		final double PI = 3.14159;
		
		double area = PI * raio * raio;
		System.out.println("Área = " + area + " m2.");
	}
}
