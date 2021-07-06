package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {
		
		double[] notasAlunosA = new double[3];
		
		notasAlunosA[0] = 7.9;
		notasAlunosA[1] = 8;
		notasAlunosA[2] = 9;
		
		System.out.println(Arrays.toString(notasAlunosA));
		
		double totalAlunoA = 0;
		
		for(int i = 0; i < notasAlunosA.length; i++) {
			totalAlunoA += notasAlunosA[i];
		}
		
		System.out.println(totalAlunoA / notasAlunosA.length);
		
		double[] notasAlunosB = {6.9, 8.9, 10};
		
		double totalAlunoB = 0;
		for(int i = 0; i < notasAlunosB.length; i++) {
			totalAlunoB += notasAlunosB[i];
		}
		
		System.out.println(totalAlunoB / notasAlunosB.length);
	}

}
