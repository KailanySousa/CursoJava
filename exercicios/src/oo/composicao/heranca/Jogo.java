package oo.composicao.heranca;

public class Jogo {

	public static void main(String[] args) {
		Monstro monstro = new Monstro();

		Heroi heroi = new Heroi(10,11);

		heroi.x = 10;
		heroi.y = 11;
		
		System.out.println("Monstro tem => " + monstro.vida);
		System.out.println("Heroi tem => " + heroi.vida);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.andar(Direcao.NORTE);
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		System.out.println("Monstro tem => " + monstro.vida);
		System.out.println("Heroi tem => " + heroi.vida);

	}

}
