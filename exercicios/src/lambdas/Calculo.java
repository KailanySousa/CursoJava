package lambdas;

// anotação para usar a interface no contexto de lambda
// sendo assim, só poderá ter um metódo abstrato
@FunctionalInterface
public interface Calculo {

	public abstract double executar(double a, double b);
	
}
