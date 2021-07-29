package streams;

public class Media {

	private double total;
	private int quantidade;
	
	public Media adicionar(double total) {
		this.total = total;
		this.quantidade++;
		return this;
	}
	
	public double getValor() {
		return this.total;
	}
	
	public static Media combinar(Media m1, Media m2) { 
		Media resultante = new Media();
		resultante.total = m1.total + m2.total;
		resultante.quantidade = m1.quantidade + m2.quantidade;
		
		return resultante;
	}
}
