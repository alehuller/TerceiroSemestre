package Model.DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Model.Entity.Usuario;

public class UsuarioDAO {
	public Usuario acessarUsuario(String nomeUser) {
		ConectarDAO conDAO = new ConectarDAO();
		Connection con = conDAO.FazerConexao();
		Usuario usuario = null;
		String sql = "SELECT * FROM user WHERE nomeuser = '" + nomeUser + "'";
		 java.sql.Statement stmt = null;
		 ResultSet resultSet = null;
		 try {
		 stmt = con.createStatement();
		 resultSet = stmt.executeQuery(sql);
		 System.out.println("chamar sql");
		 if (resultSet.next()) {
			 System.out.println("Achou!");
			 int id  = resultSet.getInt("idUser");
			 String nomeUsuario = resultSet.getString("nomeUser");
			 String senhaUser = resultSet.getString("senhaUser");
			 usuario.setIdUser(id);
			 usuario.setNomeUser(nomeUser);
			 usuario.setSenhaUser(senhaUser);
		 }
		 } catch (SQLException e) {
		 System.out.println("Erro na execução do Selelct " + sql + e);
		 }
		 System.out.println("Acesso OK");
		 
		 return usuario;
	}
}
