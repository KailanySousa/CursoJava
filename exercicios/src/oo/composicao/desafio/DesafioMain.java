package oo.composicao.desafio;

public class DesafioMain {

	public static void main(String[] args) {
		
		Produto produto1 = new Produto("Caneta", 7.45);
		Produto produto2 = new Produto("Caderno", 18.20);
		Produto produto3 = new Produto("Borracha", 6.50);
		
		Item item1 = new Item();
		item1.setProduto(produto1, 2);
		
		Item item2 = new Item();
		item2.setProduto(produto3, 5);
		
		Compra compra1 = new Compra();
		compra1.setItem(item1);
		compra1.setItem(item2);
		
		Cliente cliente1 = new Cliente("Kailany");
		cliente1.setCompra(compra1);
		
		Item item3 = new Item();
		item3.setProduto(produto2, 5); 
		
		Compra compra2 = new Compra();
		compra2.setItem(item3);
		
		cliente1.setCompra(compra2);
		
		System.out.println("Valor Total Compra 1: " + compra1.getValorTotal());
		System.out.println("Valor Total Compra 2: " + compra2.getValorTotal());
		System.out.println("Valor Total: " + cliente1.getValorTotal());
	}

}
