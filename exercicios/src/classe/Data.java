package classe;

public class Data {
	int dia;
	int mes;
	int ano;

	// metodo adicionado
	String dataFormatoBR() {
		return this.dia + "/" + this.mes + "/" + this.ano;
	}

	// metodo adicionado
	String dataFormatoUS() {
		return String.format("%d-%d-%d", ano, mes, dia);
	}
}
