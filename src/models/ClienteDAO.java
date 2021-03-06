package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import util.ConexaoMYSQL;
import models.Cliente;

public class ClienteDAO {
	
	public void create(Cliente cliente) {
		// abrindo a conex�o
		Connection con = ConexaoMYSQL.getConexaoMySQL();
		PreparedStatement stmt = null;
		
		try {
			stmt = con.prepareStatement("INSERT INTO cliente (nome, email, senha, tel, cpf) VALUES (?,?,?,?,?)");
			stmt.setString(1, cliente.getNome());	// passando o nome para o primeiro par�metro
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
			// fechando a conexa��o do o BD
			ConexaoMYSQL.closeConnection(con, stmt);
		}
	}
	
	// metodo de checagem do login
	 public boolean checkLoginCliente(String cpf, String senha) {
		 Connection con = ConexaoMYSQL.getConexaoMySQL();
		 PreparedStatement stmt = null;
		 ResultSet rs = null;
		 boolean check = false;
		 
		 try {
			 stmt = con.prepareStatement("SELECT * FROM cliente WHERE cpf = ? AND senha = ?");
			 stmt.setString(1, cpf);
			 stmt.setString(2, senha);
			 
			 rs = stmt.executeQuery();
			 
			 if(rs.next()) {
				 check = true;				  
			 }
		 } catch(SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao verificar login: "+e); 
		 } finally {
			 //fechando conexao
			 ConexaoMYSQL.closeConnection(con, stmt, rs);
		 }
		 return check;
	 }
}