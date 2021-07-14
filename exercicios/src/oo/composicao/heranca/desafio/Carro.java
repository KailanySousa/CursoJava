package oo.composicao.heranca.desafio;

public class Carro {
	
	final int VELOCIDADE_MAXIMA;
	 int delta = 5;
	int velocidade;
	
	Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	void acelerar() {
		if(this.velocidade + delta > VELOCIDADE_MAXIMA) {
			this.velocidade = VELOCIDADE_MAXIMA;
		} else {
			this.velocidade +=delta;
		}
	}
	
	void frear() {
		if(this.velocidade == delta) {
			this.parar();
		} else {
			this.velocidade -= delta;
		}
	}
	
	void parar() {
		this.velocidade = 0;
	}
}
