package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Carlos extends Ana{
	
	
	void testeAcessos() {
		// retorna erro, pois o atributo segredo está como privado
		// System.out.println(mae.segredo); 

		// não é possível acessar pois está em pacotes diferentes
		// System.out.println(mae.facoDentroDeCasa);
		
		/* 
		 	quando um atributo está como protected, não é possível
			acessar ele pela instancia do objeto
			basta chama-lo diretamente, pois pela herança
			classe atual pode chamar diretamente
		*/
		
		// Ana mae = new Ana();
		// System.out.println(mae.formaDeFalar);
		System.out.println(formaDeFalar);
		
		// é possível acessar pois está publico
		System.out.println(todosSabem);
	}
}
