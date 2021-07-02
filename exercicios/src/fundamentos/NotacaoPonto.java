package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		/*
		 * String  é um tipo não primitivo
		 * não primitivo possui mais funções
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
		
		//Tipos primitivos não possuem o operador "."
		
	}
}
