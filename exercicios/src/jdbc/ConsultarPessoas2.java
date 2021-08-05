package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import jdbc.connection.Conexao;
import jdbc.model.Pessoa;

public class ConsultarPessoas2 {

	public static void main(String[] args) throws SQLException {
		
		System.out.println("Informe o valor para a busca: ");
		Scanner entrada = new Scanner(System.in);
		String pesquisa = entrada.nextLine();
		
		Connection conexao = Conexao.getConexao();
		
		String sql = "SELECT * FROM pessoas WHERE nome LIKE ?";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, "%" + pesquisa +"%");
		
		ResultSet rs = stmt.executeQuery();
		
		List<Pessoa> pessoas = new ArrayList<>();
		while(rs.next()) {
			int id = rs.getInt("id");
			String nome = rs.getString("nome");
			
			pessoas.add(new Pessoa(id, nome));
		}
		
		if(pessoas.size() > 0) {
			for(Pessoa p: pessoas) {
				System.out.println( p.getId() + " ==> " + p.getNome());
			}
		} else {
			System.out.printf("Nenhum resultado encontrado para a busca: %s", pesquisa);
		}
		
		entrada.close();
		stmt.close();
		conexao.close();
	}

}
