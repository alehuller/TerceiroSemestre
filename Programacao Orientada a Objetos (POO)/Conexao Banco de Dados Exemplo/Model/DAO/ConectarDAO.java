package Model.DAO;

import java.sql.Connection;
import java.io.IOException;
import javax.swing.JOptionPane;
import com.mysql.cj.xdevapi.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConectarDAO {
	private static final String driver = "com.mysql.cj.jdbc.Driver";
	private static final String servidor = "localhost:3306";
	private static final String banco = "teste";
	private static final String timezone = "?useTimezone=true&serverTimezone=UTC";
	private static final String url = "jdbc:mysql://" + servidor + "/" + banco + timezone;
	private static final String usuario = "root";
	private static final String senha = "";
	
	 public Connection FazerConexao() {
		 Connection connection = null;
		 System.out.println("Chamou conexao");
		 try {
		 Class.forName(driver);
		//connection = (Connection) DriverManager.getConnection(url, usuario, senha);
		 connection = DriverManager.getConnection(url, usuario, senha);
		 System.out.println("A conexão está funcionando");
		 System.out.println("Coneção OK");
		 return connection;
		 } catch (ClassNotFoundException | SQLException e) {
		 System.out.println(e);
		 System.out.println("Erro: " + e);
		// throw new RuntimeException("Erro OCnexao",e);
		 }
		 return connection;
		 }
	
}
