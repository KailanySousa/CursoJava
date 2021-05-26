package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		// convers�o impl�cita
		double a = 1; 
		
		System.out.println(a);
		
		// convers�o expl�cita (CAST) pode perder informa��o
		float b = (float) 1.123456788888; 
		System.out.println(1.123456788888);
		System.out.println(b);
		
		int c = 340;
		// byte d = c; -> convers�o inv�lida
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 1.8789;
		// � considerado apenas a forma inteira, perda de informa��o
		int f = (int) e; 
		System.out.println(f);

	}

}
