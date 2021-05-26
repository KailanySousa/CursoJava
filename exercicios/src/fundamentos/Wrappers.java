package fundamentos;

import java.util.Scanner;

public class Wrappers {

	public static void main(String[] args) {

		Byte b = 100; // byte
		Short s = 1000; // short

		Integer i = 1000; // int
		// Scanner entrada = new Scanner(System.in);
		// Integer i = Integer.parseInt(entrada.next());
		// entrada.close()

		Long l = 100000L; // long

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);

		Float f = 123.10F;
		System.out.println(f);

		Double d = 123.10;
		System.out.println(d);

		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		// System.out.println(bo.toString());

		Character c = '#';
		System.out.println(c + "...");
	}

}
