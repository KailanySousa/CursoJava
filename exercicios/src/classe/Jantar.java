package classe;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("Kailany");
		
		Comida arroz = new Comida("Arroz", 0.25);
		pessoa.comer(arroz);
		
		Comida feijao = new Comida("Feijão", 1.0);
		pessoa.comer(feijao);
		
		Comida bife = new Comida("Bife", 0.25);
		pessoa.comer(bife);
		
		System.out.printf("%s está pesando %.2f Kg", pessoa.getNome(), pessoa.getPeso());

	}

}
