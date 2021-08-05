package jdbc.connection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexao {

	public static Connection getConexao() {
		
		try {
			Properties prop = getProperties();
			String url = prop.getProperty("db.url");
			String usuario = prop.getProperty("db.user");
			String senha = prop.getProperty("db.pass");
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
		
			return conexao;
		} catch (SQLException | IOException e) {
			throw new RuntimeException(e);
		}
		
	}
	
	private static Properties getProperties() throws IOException {
		Properties prop = new Properties();
		
		String caminho = "/conexao.properties";
		prop.load(Conexao.class.getResourceAsStream(caminho));
		
		return prop;
	}
}
