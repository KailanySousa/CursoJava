package controle;

import java.util.Scanner;

public class DesafioSemana {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String diaSemana = entrada.nextLine();
		
		// solução resolvida por mim
		if(diaSemana.toLowerCase().equals("domingo")) {
			System.out.println("1");
		} else if(diaSemana.toLowerCase().equals("segunda")) {
			System.out.println("2");
		} else if(diaSemana.toLowerCase().equals("terça")) {
			System.out.println("3");
		} else if(diaSemana.toLowerCase().equals("quarta")) {
			System.out.println("4");
		} else if(diaSemana.toLowerCase().equals("quinta")) {
			System.out.println("5");
		} else if(diaSemana.toLowerCase().equals("sexta")) {
			System.out.println("6");
		} else {
			System.out.println("7");
		}
		
		// solução do curso
		if("domingo".equalsIgnoreCase(diaSemana)) {
			System.out.println("1");
		} else if("segunda".equalsIgnoreCase(diaSemana)) {
			System.out.println("2");
		} else if("terça".equalsIgnoreCase(diaSemana)) {
			System.out.println("3");
		} else if("quarta".equalsIgnoreCase(diaSemana)) {
			System.out.println("4");
		} else if("quinta".equalsIgnoreCase(diaSemana)) {
			System.out.println("5");
		} else if("sexta".equalsIgnoreCase(diaSemana)) {
			System.out.println("6");
		} else {
			System.out.println("7");
		}
		
		entrada.close();

	}

}
