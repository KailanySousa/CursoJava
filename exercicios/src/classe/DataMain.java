package classe;

public class DataMain {

	public static void main(String[] args) {
		Data dt1 = new Data();
		dt1.dia = 24;
		dt1.mes = 10;
		dt1.ano = 2002;
		
		Data dt2 = new Data();
		dt2.dia = 15;
		dt2.mes = 10;
		dt2.ano = 2016;
		
		System.out.println(dt1.dataFormatoBR());
		System.out.println(dt1.dataFormatoUS());
	}

}
