package oo.composicao.heranca.desafio;

public class DesafioMain {

	public static void main(String[] args) {

		Carro carro = new Carro(120);
		carro.acelerar();
		System.out.println("Velocidade Carro => " + carro.velocidade);

		carro.acelerar();
		System.out.println("Velocidade Carro => " + carro.velocidade);

		carro.frear();
		System.out.println("Velocidade Carro => " + carro.velocidade);

		carro.frear();
		System.out.println("Velocidade Carro => " + carro.velocidade);

		Civic civic = new Civic(212);

		civic.acelerar();
		System.out.println("Velocidade Civic => " + civic.velocidade);

		civic.acelerar();
		System.out.println("Velocidade Civic => " + civic.velocidade);

		civic.frear();
		System.out.println("Velocidade Civic => " + civic.velocidade);

		civic.frear();
		System.out.println("Velocidade Civic => " + civic.velocidade);

		Ferrari ferrari = new Ferrari();

		ferrari.acelerar();
		System.out.println("Velocidade Ferrari => " + ferrari.velocidade);

		ferrari.acelerar();
		System.out.println("Velocidade Ferrari => " + ferrari.velocidade);

		ferrari.frear();
		System.out.println("Velocidade Ferrari => " + ferrari.velocidade);

		ferrari.frear();
		System.out.println("Velocidade Ferrari => " + ferrari.velocidade);
	}

}
