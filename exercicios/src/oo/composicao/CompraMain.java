package oo.composicao;

public class CompraMain {

	public static void main(String[] args) {
		Compra c1 = new Compra();
		c1.cliente = "Kailany";
		
		c1.setItem(new Item("Caneta", 20, 7.45));
		c1.setItem(new Item("Borracha", 12, 3.89));
		c1.setItem(new Item("Caderno", 3, 18.20));

		System.out.println(c1.itens.size());
		System.out.println(c1.getValorTotal());
	}

}
