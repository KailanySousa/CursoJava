
public class CaixaObjetoMain {

	public static void main(String[] args) {
	
		CaixaObjeto caixaA = new CaixaObjeto();
		
		caixaA.guardar(2.2);
		
		Integer coisa = (Integer) caixaA.abrir();
		System.out.println(coisa);

	}

}
