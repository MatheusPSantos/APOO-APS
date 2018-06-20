package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import util.ConexaoMYSQL;

public class LojistaDAO {

	// metodo que cria um lojista no banco
	public void create(Lojista lojista) {
		// abrindo a conexação com o banco
		Connection con = ConexaoMYSQL.getConexaoMySQL();
		PreparedStatement stmt = null;
		
		try {
			stmt = con.prepareStatement("INSERT INTO lojista (nome, email, senha, tel, cnpj) VALUES (?,?,?,?,?)");
			stmt.setString(1, lojista.getNome());	// passando o nome
			stmt.setString(2, lojista.getEmail());	// pegando o email
			stmt.setString(3, lojista.getSenha());	// pegando a senha
			stmt.setString(4, lojista.getTelefone());	// pegando o telefone
			stmt.setString(5, lojista.getCNPJ());	// pegando o cnpj
			
			stmt.executeUpdate();	// executando a sql
			JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
		} catch(SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao salvar: "+e);
			e.printStackTrace();			
		} finally {
			// fechando a conexação do o BD
			ConexaoMYSQL.closeConnection(con, stmt);			
		}
	}
}
