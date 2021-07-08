package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O pequeno livro"); // retorna false
		livros.push("A reliquia"); // retorna exceção 
		livros.addLast("dom quixote");
		
		for(String livro: livros) {
			System.out.println(livro);
		}
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		System.out.println(livros.poll());
		System.out.println(livros.remove());
		System.out.println(livros.pop());
		
		// livros.size();
		// livros.clear();
		// livros.isEmpty();
		// livros.contains();
	
	}

}
