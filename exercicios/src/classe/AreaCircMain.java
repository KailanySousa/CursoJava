package classe;

public class AreaCircMain {

	public static void main(String[] args) {
		AreaCirc a1 = new AreaCirc(5.6);
		a1.raio = 10;
		
		System.out.println(AreaCirc.PI);
		System.out.println(a1.area());
		System.out.println(AreaCirc.area(10));
		
	}

}
