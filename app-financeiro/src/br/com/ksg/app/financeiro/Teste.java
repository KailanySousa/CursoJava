package br.com.ksg.app.financeiro;

import br.com.ksg.app.calculo.Calculadora;
import br.com.ksg.app.calculo.interno.OperacoesAritmeticas;

public class Teste {

	public static void main(String[] args) {
		
		Calculadora c = new Calculadora();
		System.out.println(c.soma(2, 3 ,4));
		
		OperacoesAritmeticas op = new OperacoesAritmeticas();
		System.out.println(op.soma(5, 6, 7));
	}

}
