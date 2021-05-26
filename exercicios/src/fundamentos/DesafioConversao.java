package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor do primeiro salario: ");
		String salario1 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Digite o valor do segundo salario: ");
		String salario2 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Digite o valor do terceiro salario");
		String salario3 = entrada.nextLine().replace(",", ".");
		
		entrada.close();
		
		double sal1 = Double.parseDouble(salario1);
		double sal2 = Double.parseDouble(salario2);
		double sal3 = Double.parseDouble(salario3);
		
		double soma = sal1 + sal2+ sal3;
		double media = soma / 3;
		
		System.out.println("A soma é " + soma);
		System.out.println("A média é " + media);

	}

}
