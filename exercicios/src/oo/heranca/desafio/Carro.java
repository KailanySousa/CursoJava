package oo.heranca.desafio;

public class Carro {
	
	final int VELOCIDADE_MAXIMA;
	protected int delta = 5;
	public int velocidade;
	
	protected Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar() {
		if(this.velocidade + delta > VELOCIDADE_MAXIMA) {
			this.velocidade = VELOCIDADE_MAXIMA;
		} else {
			this.velocidade +=delta;
		}
	}
	
	public void frear() {
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
