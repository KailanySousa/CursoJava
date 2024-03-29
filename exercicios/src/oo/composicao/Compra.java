package oo.composicao;

import java.util.ArrayList;

public class Compra {
	
	String cliente;
	ArrayList<Item> itens = new ArrayList<Item>();
	
	void setItem(Item item) {
		this.itens.add(item);
	}
	
	double getValorTotal() {
		double total = 0;
		
		for(Item item: this.itens) {
			total += item.preco;
		}
		
		return total;
	}
}
