package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {

	private boolean ligarTurbo;
	private boolean ligarAr;

	public Ferrari() {
		this(315);
	}

	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		this.setDelta(this.getDelta());
	}

	@Override
	public void ligarAr() {
		this.ligarAr = true;
	}

	@Override
	public void desligarAr() {
		this.ligarAr = false;
	}

	@Override
	public void ligarTurbo() {
		this.ligarTurbo = true;
	}

	@Override
	public void desligarTurbo() {
		this.ligarTurbo = false;
	}

	@Override
	public int getDelta() {
		if (this.ligarTurbo && !this.ligarAr) {
			return 35;
		} else if (this.ligarTurbo && this.ligarAr) {
			return 30;
		} else if (!this.ligarTurbo && this.ligarAr) {
			return 20;
		} else {
			return 15;
		}
	}

// exemplo de sobrecarga 
//	@Override
//	void acelerar() {
//		this.velocidade += 15;
//	}
}
