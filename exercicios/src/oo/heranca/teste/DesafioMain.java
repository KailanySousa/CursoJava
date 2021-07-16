package oo.heranca.teste;

import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class DesafioMain {

	public static void main(String[] args) {

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
		ferrari.acelerar();
		System.out.println("Velocidade Ferrari => " + ferrari.velocidade);

		ferrari.ligarTurbo();
		ferrari.ligarAr();
		System.out.println("Velocidade Ferrari => " + ferrari.velocidade);
		
		ferrari.desligarTurbo();
		System.out.println("Velocidade Ferrari => " + ferrari.velocidade);

		ferrari.frear();
		System.out.println("Velocidade Ferrari => " + ferrari.velocidade);

		ferrari.frear();
		System.out.println("Velocidade Ferrari => " + ferrari.velocidade);
	}

}
