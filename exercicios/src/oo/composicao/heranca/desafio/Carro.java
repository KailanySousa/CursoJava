package oo.composicao.heranca.desafio;

public class Carro {
	
	int velocidade;
	
	void acelerar() {
		this.velocidade +=5;
	}
	
	void frear() {
		if(this.velocidade == 5) {
			this.parar();
		} else {
			this.velocidade -= 5;
		}
	}
	
	void parar() {
		this.velocidade = 0;
	}
}
