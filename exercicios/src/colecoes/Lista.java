package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		
		List<Usuario> lista = new ArrayList<>();
		
		lista.add(new Usuario("Kailany"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Manu"));
		lista.add(new Usuario("Bia"));
		
		// o List permite acessar um elemento pelo indice
		System.out.println(lista.get(3)); 
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
		
		lista.remove(3); // retorna o objeto removido
		lista.remove(new Usuario("Bia")); // retorna um boolean
		
		lista.contains(new Usuario("Kailany"));

	}

}
