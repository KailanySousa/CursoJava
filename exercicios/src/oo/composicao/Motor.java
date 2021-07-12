package oo.composicao;

public class Motor {

	final Carro carro;
	
	boolean ligado = false;
	double fatorInjecao = 1;

	Motor (Carro carro){
		this.carro = carro;
	}
	
	int giros() {

		return ligado ? (int) Math.round(fatorInjecao * 3000) : 0;

	}
}
