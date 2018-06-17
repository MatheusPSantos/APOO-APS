package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.mysql.*;

public class ConexaoMYSQL {
	
	//metodo para abrir a conexao com o BD
	public static Connection getConexaoMySQL() {
		Connection conexao = null;
		try {
			String connectionURL = "jdbc:mysql://localhost:3306/imarket?autoreconnect=true&useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
			conexao = DriverManager.getConnection(connectionURL, "root", "jxtnlx33");
			System.out.println("Conexão com o banco realizada.");
		} catch(SQLException e) {
			System.err.println(e);
		}
		
		return conexao;
	}
	
	// método para fechar a conexao com o BD
	public static void closeConnection(Connection con) {
		try {
			if(con != null) {
				con.close();
			}
		} catch(SQLException e) {
			System.out.println(e);
		}
	}
	
	public static void closeConnection(Connection con, PreparedStatement stmt) {
		closeConnection(con);
		try {
			if(stmt != null) {
				stmt.close();
			}
		} catch(SQLException e) {
			System.out.println(e);
		}
	}
}
