package lambdas;

// anota��o para usar a interface no contexto de lambda
// sendo assim, s� poder� ter um met�do
@FunctionalInterface
public interface Calculo {

	public abstract double executar(double a, double b);
}
