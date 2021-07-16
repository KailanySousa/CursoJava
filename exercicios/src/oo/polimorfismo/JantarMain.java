package oo.polimorfismo;

public class JantarMain {

	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa(99.65);
		System.out.println(convidado.getPeso());
		
		Arroz arroz = new Arroz(0.25);
		convidado.comer(arroz);
		System.out.println(convidado.getPeso());
		
		Feijao feijao = new Feijao(0.100);
		convidado.comer(feijao);
		System.out.println(convidado.getPeso());
		
		Sorvete sorvete = new Sorvete(0.150);
		convidado.comer(sorvete);
		System.out.println(convidado.getPeso());

	}

}
