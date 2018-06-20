package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import util.ConexaoMYSQL;
import models.Cliente;

public class ClienteDAO {
	
	public void create(Cliente cliente) {
		// abrindo a conexão
		Connection con = ConexaoMYSQL.getConexaoMySQL();
		PreparedStatement stmt = null;
		
		try {
			stmt = con.prepareStatement("INSERT INTO cliente (nome, email, senha, tel, cpf) VALUES (?,?,?,?,?)");
			stmt.setString(1, cliente.getNome());	// passando o nome para o primeiro parâmetro
			stmt.setString(2, cliente.getEmail()); // passando o email
			stmt.setString(3, cliente.getSenha());	// passando a senha
			stmt.setString(4, cliente.getTelefone());	// passando o telefone
			stmt.setString(5, cliente.getCPF()); 	// passando o cpf
			
			// Executando a SQL
			stmt.executeUpdate();
			
			// mensagem de aviso
			JOptionPane.showMessageDialog(null, "Cadastrado com sucesso");
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao salvar: "+e);
			e.printStackTrace();
		} finally {
			// fechando a conexação do o BD
			ConexaoMYSQL.closeConnection(con, stmt);
		}
	}
}