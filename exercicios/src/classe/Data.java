package classe;

public class Data {
	int dia;
	int mes;
	int ano;

	// metodo adicionado
	public String dataFormatoBR() {
		return this.dia + "/" + this.mes + "/" + this.ano;
	}

	// metodo adicionado
	public String dataFormatoUS() {
		return this.ano + "-" + this.mes + "-" + this.dia;
	}
}
