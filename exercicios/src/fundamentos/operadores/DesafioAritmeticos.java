package fundamentos.operadores;

public class DesafioAritmeticos {

	public static void main(String[] args) {
	
		int exp1 = (int) Math.pow((3+2) * 6, 2) / (3*2);
		
		int exp2 = (int) Math.pow((1-5) * (2-7)/2, 2);
		
		int resultado = exp1 - exp2;
		resultado = (int) Math.pow(resultado, 3) ;
		resultado = (int) (resultado  / Math.pow(10, 3));
		
		System.out.println(resultado);
	}

}
