package classe;

public class ProdutoMain {

	public static void main(String[] args) {
	
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4500.00;
		p1.desconto = 0.25;
		
		var p2 = new Produto();
		p1.nome = "Caneta Azul";
		p1.preco = 7.00;
		p1.desconto = 0.29;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.preco * (1-p1.desconto);
		double precoFinal2 = p2.preco * (1-p2.desconto);
		
		System.out.println("Preco com desconto gerente  " + p1.precoComDescontoGerente(0.10));
		
		System.out.println("Preço total = " + (precoFinal1 + precoFinal2));
	}

}
