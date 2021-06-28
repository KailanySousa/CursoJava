package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a média: ");
		double media = entrada.nextDouble();
		
		if(media >= 7.0 && media <= 10) {
			System.out.println("Aprovado!");
		}
		
		if(media >= 4.5 && media < 7) {
			System.out.println("Recuperação");
		}
		
		boolean criterioReprovacaoAtingindo = media < 4.5 && media >= 0;
		
		if(criterioReprovacaoAtingindo)
			System.out.println("Reprovado");
		
		entrada.close();

	}

}
