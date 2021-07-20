package lambdas;

import java.util.function.BinaryOperator;

public class CalculoMain3 {

	public static void main(String[] args) {
		
		// interface funciona padrao que recebe dois parametros do mesmo tipo
		// e retorna um valor do mesmo tipo
		BinaryOperator<Double> calc =(x, y) -> {return x * y;};
		System.out.println(calc.apply(2.0, 3.0));
		
		calc = ( x, y) -> {return x + y;};
		System.out.println(calc.apply(2.0, 3.0));
	}

}
