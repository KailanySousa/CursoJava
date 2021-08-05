package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jdbc.connection.Conexao;
import jdbc.model.Pessoa;

public class ConsultarPessoas1 {

	public static void main(String[] args) throws SQLException {
		
		Connection conexao = Conexao.getConexao();
		
		String sql = "SELECT * FROM pessoas";
		Statement stmt = conexao.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
	
		List<Pessoa> pessoas = new ArrayList<>();
		while(rs.next()) {
			int id = rs.getInt("id");
			String nome = rs.getString("nome");
			pessoas.add(new Pessoa(id, nome));
			
		}
		
		for(Pessoa p: pessoas) {
			System.out.println(p.getId() + " ==> " + p.getNome());
		}
		
		stmt.close();
		conexao.close();
	}

}
