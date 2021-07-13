package oo.composicao.desafio;

public class Item {
	
	int qtd;
	Produto produto;
	
	void setProduto(Produto produto, int qtd) {
		this.qtd = qtd;
		this.produto = produto;
		
	}
	
	double getValorItem() {
		return  this.qtd * this.produto.preco;
	}

}
