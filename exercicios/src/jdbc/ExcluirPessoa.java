package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import jdbc.connection.Conexao;

public class ExcluirPessoa {

	public static void main(String[] args) throws SQLException {
		
		System.out.println("Informe o código: ");
		Scanner entrada = new Scanner(System.in);
		int id = entrada.nextInt();
		Connection conexao = Conexao.getConexao();
		
		String sql = "DELETE FROM pessoas WHERE id = ?";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, id);

		if(stmt.executeUpdate() > 0) {
			System.out.println("Pessoa excluida com sucesso!");
		} else {
			System.out.println("Nenhuma alteração foi feita!");
		}
		
		stmt.close();
		entrada.close();
		conexao.close();
	}

}
