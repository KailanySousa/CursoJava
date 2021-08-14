package br.com.ksg.app.calculo;

import br.com.ksg.app.calculo.interno.OperacoesAritmeticas;
import br.com.ksg.app.logging.Logger;

public class Calculadora {

	private OperacoesAritmeticas op = new OperacoesAritmeticas();

	public double soma(double... nums) {
		Logger.info("Somando");
		return op.soma(nums);
	}
	
}
