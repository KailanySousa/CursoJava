package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import jdbc.connection.Conexao;
import jdbc.model.Pessoa;

public class AtualizarRegistro {

	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o id do registro que deseja alterar: ");
		int id = entrada.nextInt();
		
		Connection conexao = Conexao.getConexao();
		
		String sql = "SELECT * FROM pessoas WHERE id = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		
		stmt.setInt(1, id);
		
		ResultSet rs = stmt.executeQuery();
		
		if(rs.next()) {
			Pessoa p = new Pessoa(rs.getInt("id"), rs.getString("nome"));
			System.out.println("Registro encontrado: " + p.getId() + " ==> " + p.getNome());
			stmt.close();
		
			entrada.nextLine();
			
			System.out.println("Informe o novo nome: ");
			String nome = entrada.nextLine();
			sql = "UPDATE pessoas SET nome = ? WHERE id = ?";
			
			stmt = conexao.prepareStatement(sql);
			stmt.setString(1, nome);
			stmt.setInt(2, id);
			
			stmt.execute();
			
			System.out.println("Pessoa alterada com sucesso!");
		} else {
			System.out.println("Pessoa não encontrada!");
		}
		
		stmt.close();
		conexao.close();
		entrada.close();
		

	}

}
