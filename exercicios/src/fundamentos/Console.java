package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
	
		// print sem quebra de linha
		System.out.print("Bom");
		System.out.print(" dia\n\n");
		
		// print com quebra de linha
		System.out.println("Bom");
		System.out.println("dia!");
		
		// print com formato
		System.out.printf("Megasena: %d %d %d %d %d %d %n", 1,2,3,4,5,6);
		System.out.printf("Salário: %.2f %n", 123.5678);
		System.out.printf("Nome: %s%n", "Kailany");
		
		// Scanner -> objeto para ler valores no console
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("\n\nNome = " + nome);
		
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.println("\n\nNome = " + nome + " " + sobrenome);
		
		entrada.close();
	}
}
