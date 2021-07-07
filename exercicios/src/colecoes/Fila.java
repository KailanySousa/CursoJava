package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();

		// retorna true/false para caso consiga 
		// adicionar numa fila que tenha restri��o de tamanho
		fila.add("Ana"); 
	
		// pode dar erro caso uma fila tenha restri��o de tamanho
		fila.offer("Kailany");
		fila.add("Bia");
		fila.offer("Carlos");
		
		// obtem o pr�ximo elemento da fila
		// caso n�o tenha elemento na fila retorna null
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		
		// caso n�o tenha elemento na fila ocasiona erro
		System.out.println(fila.element());
		System.out.println(fila.element());
		
		// fila.size();
		// fila.clear();
		// fila.isEmpty();
		
		fila.poll();// retorna false
		fila.remove(); // retorna erro caso a fila esteja vazia
	}

}
