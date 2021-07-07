package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('X');
		
		// tamanho colection
		System.out.println(conjunto.size());
		
		conjunto.add("teste");
		conjunto.add('X'); // set não aceita repetição
		
		System.out.println(conjunto.size());
		
		// removendo elementos da colection
		System.out.println(conjunto.remove("teste")); 
	
		System.out.println(conjunto.size());
		
		System.out.println(conjunto.contains(1));
		System.out.println('x');
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		// união entre dois conjuntos
		conjunto.addAll(nums);
		System.out.println(conjunto);
		
		// interseção entre dois conjuntos
		conjunto.retainAll(nums);
		
		// limpando conjunto
		conjunto.clear();
		System.out.println(conjunto);
		System.out.println(conjunto);
	}
}
