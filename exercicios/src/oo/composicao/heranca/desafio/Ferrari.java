package oo.composicao.heranca.desafio;

public class Ferrari extends Carro {
	
	public Ferrari() {
		this(315);
	}
	
	public Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima);
		delta = 15;
	}

// exemplo de sobrecarga 
//	@Override
//	void acelerar() {
//		this.velocidade += 15;
//	}
}
