package br.com.ksg.app.calculo;

import br.com.ksg.app.calculo.interno.OperacoesAritmeticas;

public class Calculadora {

	private OperacoesAritmeticas op = new OperacoesAritmeticas();

	public double soma(double... nums) {
		return op.soma(nums);
	}
	
}
