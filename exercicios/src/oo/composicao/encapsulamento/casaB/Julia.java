package oo.composicao.encapsulamento.casaB;

import oo.composicao.encapsulamento.casaA.Ana;

public class Julia {
	void testeAcessos() {
		Ana sogra = new Ana();
		
		// retorna erro, pois o atributo segredo está como privado
		// System.out.println(sogra.segredo); 

		// retorna erro, pois estão em pacotes diferentes
		// System.out.println(sogra.facoDentroDeCasa);
		
		// retorna erro, pois estão em pacotes diferentes
		// e sem relação de herança
		// System.out.println(sogra.formaDeFalar);
		
		// é possível acessar pois está publico
		System.out.println(sogra.todosSabem);
	}
}
