package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		
		Consumer<Produto> imprimirNome = p -> System.out.println(p.nome);
		
		Produto p1 = new Produto("SSD 250GB", 300.56, 0.20);
		imprimirNome.accept(p1);
		
		Produto p2 = new Produto("Notebook", 1400.00, 0.15);
		Produto p3 = new Produto("Caneta", 14.50, 0.15);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3);
		produtos.forEach(imprimirNome);
		produtos.forEach(p -> System.out.println(p.preco));
		
		produtos.forEach(System.out::println);
	}

}
