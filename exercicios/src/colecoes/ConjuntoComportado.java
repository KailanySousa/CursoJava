package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		// Set<String> lista = new HashSet<>();
		
		// ordenação respeita a ordem da adição dos elementos
		SortedSet<String> lista = new TreeSet<>();
		
		lista.add("Kailany");
		lista.add("Ana");
		lista.add("Carlos");
		
		for(String pessoa: lista) {
			System.out.println(pessoa);
		}
		
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(3);
		nums.add(2);
		
		for(int n: nums) {
			System.out.println(n);
		}
	}

}
