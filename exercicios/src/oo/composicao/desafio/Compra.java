package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {

	Cliente cliente;
	ArrayList<Item> itens = new ArrayList<>();
	double valorTotal;
	
	void setItem(Item item) {
		this.itens.add(item);
	}
	
	double getValorTotal() {
		double total = 0;
		
		for(Item item: this.itens) {
			total+= item.getValorItem();
		}
		
		return total;
	}
}
