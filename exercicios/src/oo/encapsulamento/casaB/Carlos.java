package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Carlos extends Ana{
	
	
	void testeAcessos() {
		// retorna erro, pois o atributo segredo est� como privado
		// System.out.println(mae.segredo); 

		// n�o � poss�vel acessar pois est� em pacotes diferentes
		// System.out.println(mae.facoDentroDeCasa);
		
		/* 
		 	quando um atributo est� como protected, n�o � poss�vel
			acessar ele pela instancia do objeto
			basta chama-lo diretamente, pois pela heran�a
			classe atual pode chamar diretamente
		*/
		
		// Ana mae = new Ana();
		// System.out.println(mae.formaDeFalar);
		System.out.println(formaDeFalar);
		
		// � poss�vel acessar pois est� publico
		System.out.println(todosSabem);
	}
}
