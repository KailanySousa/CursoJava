package oo.composicao.desafio;

import java.util.ArrayList;

public class Cliente {
	
	String nome;
	ArrayList<Compra> compras = new ArrayList<>();
	
	Cliente(String nome){
		this.nome = nome;
	}
	
	void setCompra(Compra compra) {
		this.compras.add(compra);
	}
	
	double getValorTotal() {
		double total = 0;
		
		for (Compra compra : this.compras) {
			total += compra.getValorTotal();
		}
		
		return total;
	}
}
