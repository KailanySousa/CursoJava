package oo.composicao.heranca.desafio;

public class Ferrari extends Carro {
	
	Ferrari() {
		this(315);
	}
	
	Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima);
		delta = 15;
	}

// exemplo de sobrecarga 
//	@Override
//	void acelerar() {
//		this.velocidade += 15;
//	}
}
