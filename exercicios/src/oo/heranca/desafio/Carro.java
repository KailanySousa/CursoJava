package oo.heranca.desafio;

public class Carro {
	
	final int VELOCIDADE_MAXIMA;
	private int delta = 5;
	public int velocidade;
	
	protected Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar() {
		if(this.velocidade + this.getDelta() > VELOCIDADE_MAXIMA) {
			this.velocidade = VELOCIDADE_MAXIMA;
		} else {
			this.velocidade +=this.getDelta();
		}
	}
	
	public void frear() {
		if(this.velocidade == this.getDelta()) {
			this.parar();
		} else {
			this.velocidade -= this.getDelta();
		}
	}
	
	void parar() {
		this.velocidade = 0;
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
	
	

}
