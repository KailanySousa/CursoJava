package classe;

public class Data {
	int dia;
	int mes;
	int ano;
	
	// quando uma constante � criada, 
	// � necess�rio definir o seu valor
	// at� o objeto ser construido, ou seja,
	// em um dos construtores da classe ou 
	// no momento em que ela � criada
	
	Data(){
		// this.dia = 1;
		// this.mes = 1;
		// this.ano = 1970;
		
		// um construtor pode chamar outro construtor
		this(1,1,1970);
		
		// valores padr�es dos tipos primitivos
		// quando o valor n�o � informado
		// byte, short, int, long -> 0
		// float, double -> 0
		// boolean -> false
		// char -> '\u0000'
		
		// por padr�o o java n�o permite usar 
		// uma variavel local sem inicializa-la antes
	}
	
	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	// metodo adicionado
	String dataFormatoBR() {
		return this.dia + "/" + this.mes + "/" + this.ano;
	}

	// metodo adicionado
	String dataFormatoUS() {
		final String formato = "%d-%d-%d";
		return String.format(formato, this.ano, this.mes, this.dia);
	}
}
