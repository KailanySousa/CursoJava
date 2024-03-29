package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		
		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "�mpar";
		
		System.out.println(parOuImpar.apply(6));
		
		Function<String, String> oResultadoE = valor -> "O resultado �: " + valor;
		
		String resultadoFinal = parOuImpar.andThen(oResultadoE).apply(5);
		System.out.println(resultadoFinal);

	}

}
