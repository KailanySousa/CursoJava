package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int qtdNotas = 0;
		double nota = 8;
		double total = 0;
		
		while(nota != -1) {
			System.out.println("Informe a nota");
			nota = entrada.nextDouble();
			if(nota >= 0 && nota <= 10) {
				total += nota;
				qtdNotas++;				
			} else if(nota != -1) {
				System.out.println("Nota inválida");
			}
		}
	
		double media = total / qtdNotas;
		System.out.println("Média = " + media);
		entrada.close();
	}
	
	

}
