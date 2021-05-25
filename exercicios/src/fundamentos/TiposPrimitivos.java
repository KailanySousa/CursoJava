package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//Informações do funcionario
		
		//Tipos númericos inteiros
		byte anosDeEmpresa= 23;
		short numeroDeVoos= 32468;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L; // literal long
		
		//Tipos númericos reais
		float salario = 11_445.44F; // literal float
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipo boolean
		boolean estaDeFerias = false;
		
		//Tipo caractere
		char status = 'A'; // '\u0010'
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//número de viagens
		System.out.println(numeroDeVoos/2);
		
		//pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
	}
}
