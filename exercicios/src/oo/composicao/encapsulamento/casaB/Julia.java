package oo.composicao.encapsulamento.casaB;

import oo.composicao.encapsulamento.casaA.Ana;

public class Julia {
	void testeAcessos() {
		Ana sogra = new Ana();
		
		// retorna erro, pois o atributo segredo est� como privado
		// System.out.println(sogra.segredo); 

		// retorna erro, pois est�o em pacotes diferentes
		// System.out.println(sogra.facoDentroDeCasa);
		
		// retorna erro, pois est�o em pacotes diferentes
		// e sem rela��o de heran�a
		// System.out.println(sogra.formaDeFalar);
		
		// � poss�vel acessar pois est� publico
		System.out.println(sogra.todosSabem);
	}
}
