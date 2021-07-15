package oo.encapsulamento.casaA;

public class Paulo {

	Ana esposa = new Ana();

	void testeAcessos() {
		// retorna erro, pois o atributo segredo est� como privado
		// System.out.println(esposa.segredo); 

		// � poss�vel acessar pois est� no mesmo pacote
		System.out.println(esposa.facoDentroDeCasa);
		
		// � poss�vel acessar pois est� no mesmo pacote
		System.out.println(esposa.formaDeFalar);
		
		// � poss�vel acessar pois est� publico
		System.out.println(esposa.todosSabem);
	}
}
