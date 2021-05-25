package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		double a = 2.3;
		
		/*
		 * String  � um tipo n�o primitivo
		 * n�o primitivo possui mais fun��es
		 * */
		String s = "Bom dia X";
		
		s = s.toUpperCase();
		System.out.println(s);
		
		s = s.replace("X", "Senhora");
		System.out.println(s);
		
		s = s.concat("!!!");
		System.out.println(s);
		
		String x = "Bom dia X"
				.replace("X", "kai")
				.toUpperCase()
				.concat("!!!");
		
		System.out.println(x);
		
		//Tipos primitivos n�o possuem o operador "."
		
	}
}
