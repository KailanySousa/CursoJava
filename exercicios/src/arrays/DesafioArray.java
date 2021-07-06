package arrays;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o número de notas que serão cadastradas: ");
		
		int qtdNotas = entrada.nextInt();
		
		double[] notas = new double[qtdNotas];
		
		for(int i = 0; i < qtdNotas; i++) {
			System.out.printf("Digite a nota %d: \n", i + 1);
			notas[i] = entrada.nextInt();
		}
		
		double somaNotas = 0;
		
		for(double nota: notas) {
			somaNotas += nota;
		}
		
		double media = somaNotas / qtdNotas;
		
		System.out.println("Soma de todas as notas = " + somaNotas);
		System.out.println("Média de todas as notas = " + media);
		
		entrada.close();
		
	}

}
