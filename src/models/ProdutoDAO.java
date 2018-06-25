package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import util.ConexaoMYSQL;

public class ProdutoDAO {
	
	// metodo de cadastrar produto
	public void create(Produto produto, Lojista lojista) {
		// abrindo a conexao
		Connection con = ConexaoMYSQL.getConexaoMySQL();
		PreparedStatement stmt = null;
		try {
			stmt = con.prepareStatement("INSERT INTO produto (prod_nome, prod_valor, prod_quantidade, prod_marca, prod_id, lojista_cnpj) VALUES (?,?,?,?,?,?");
			stmt.setString(1, produto.getNome());
			stmt.setFloat(2, produto.getValor());
			stmt.setInt(3, produto.getQuantidade());
			stmt.setString(4, produto.getMarca());
			stmt.setInt(5, produto.getProd_id());
			stmt.setString(6, lojista.getCNPJ());
			stmt.executeUpdate();
			JOptionPane.showMessageDialog(null,"Produto Cadastrado com sucesso.");
		}catch(SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro: "+e);
		}finally {
			ConexaoMYSQL.closeConnection(con, stmt);
		}
	}
}
