package oo.encapsulamento.casaA;

public class Paulo {

	Ana esposa = new Ana();

	void testeAcessos() {
		// retorna erro, pois o atributo segredo está como privado
		// System.out.println(esposa.segredo); 

		// é possível acessar pois está no mesmo pacote
		System.out.println(esposa.facoDentroDeCasa);
		
		// é possível acessar pois está no mesmo pacote
		System.out.println(esposa.formaDeFalar);
		
		// é possível acessar pois está publico
		System.out.println(esposa.todosSabem);
	}
}
