package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		// conversão implícita
		double a = 1; 
		
		System.out.println(a);
		
		// conversão explícita (CAST) pode perder informação
		float b = (float) 1.123456788888; 
		System.out.println(1.123456788888);
		System.out.println(b);
		
		int c = 340;
		// byte d = c; -> conversão inválida
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 1.8789;
		// é considerado apenas a forma inteira, perda de informação
		int f = (int) e; 
		System.out.println(f);

	}

}
