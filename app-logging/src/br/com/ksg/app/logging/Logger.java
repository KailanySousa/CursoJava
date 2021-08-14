package br.com.ksg.app.logging;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

	public static void info(String msg) {
		SimpleDateFormat sdt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println("[INFO] - " + sdt.format(new Date()) + " - " + msg);
	}
}
