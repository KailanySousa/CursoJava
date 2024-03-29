package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import jdbc.connection.Conexao;

public class CriarTabelaPessoas {

	public static void main(String[] args) throws SQLException {

		Connection conexao = Conexao.getConexao();

		// text block
		String sql = """ 
					CREATE TABLE IF NOT EXISTS pessoas (
						id INT AUTO_INCREMENT PRIMARY KEY,
						nome VARCHAR(80) NOT NULL
					);""";

		Statement stmt = conexao.createStatement();
		stmt.execute(sql);
		
		System.out.println("Tabela criada com sucesso!");

		conexao.close();

	}

}
