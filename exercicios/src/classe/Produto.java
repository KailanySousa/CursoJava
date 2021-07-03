package classe;

public class Produto {
	String nome;
	double preco;
	double desconto;
	
	double precoComDescontoGerente(double descontoGerente){
		return preco * (1 - desconto + descontoGerente);
	} 
	
	double precoComDesconto(double preco, double desconto){
		return preco * (1 - desconto);
	}
}
