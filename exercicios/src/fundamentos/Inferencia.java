package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		double a = 4.5;
		System.out.println(a);
		
		/* Java permite inferencia, ou seja,
		 � poss�vel declarar uma variavel sem o tipo
		 no caso, o tipo associado a variavel,
		 vai ser de acordo com o valor que foi inserido,
		 e n�o podera inserir valores de outro tipo
		*/
		
		var b = 4.5; // como o valor inserido � um double, a variavel s� aceitar� valores double
		System.out.println(b);
		
		var c  = "Texto"; // como o valor inserido � uma string, a variavel s� aceitar� valores string
		System.out.println(c);
		
		/*
		 * O caso a seguir ocasiona um erro, 
		 * pois � necess�rio que no mesmo momento em que
		 * a vari�vel � declarada com "var" precisa informar o valor dela
		 * para que assim o tipo seja identificado
			var e;
			e = 123.45;
			
		* Caso correto: 
		* var e = 123.45;
		*/
	}
}
