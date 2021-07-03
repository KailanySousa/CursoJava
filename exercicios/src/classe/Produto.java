package classe;

public class Produto {
	String nome;
	double preco;
	double desconto;
	
	Produto(){}
	
	Produto(String nome){
		this.nome = nome;
	}
	
	Produto(String nome, double preco){
		this.nome = nome;
		this.preco = preco;
	}
	
	Produto(String nome, double preco, double desconto){
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	double precoComDescontoGerente(double descontoGerente){
		return preco * (1 - desconto + descontoGerente);
	} 
	
	double precoComDesconto(double preco, double desconto){
		return preco * (1 - desconto);
	}
}
