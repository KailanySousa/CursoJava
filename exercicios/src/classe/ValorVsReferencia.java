package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
		
		double a = 2;
		double b = a;
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		Data d1 = new Data(1,6,2020);
		
		Data d2 = d1;
		
		d1.dia = 31;
		d2.mes = 12;
		
		d1.ano = 2025;
		
		System.out.println(d1.dataFormatoBR());
		System.out.println(d2.dataFormatoBR());
		
		voltarDataValorPadrao(d1);
		
		System.out.println(d1.dataFormatoBR());
		System.out.println(d2.dataFormatoBR());
		
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);
	}
	
	static void voltarDataValorPadrao(Data d) {
		d.mes = 1;
		d.ano = 1970;
		d.dia = 1;
	}
	
	static void alterarPrimitivo(int a) {
		a++;
	}

}
