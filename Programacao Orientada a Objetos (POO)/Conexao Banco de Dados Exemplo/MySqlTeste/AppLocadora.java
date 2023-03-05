package MySqlTeste;

import java.sql.Connection;

import java.io.IOException;

import javax.swing.JOptionPane;

import java.sql.DriverManager;

import java.sql.SQLException;

import java.sql.PreparedStatement;



import java.sql.ResultSet;

import com.mysql.cj.protocol.Resultset;

import com.mysql.cj.xdevapi.Statement;

import com.mysql.cj.xdevapi.Statement;



import java.sql.*;



public class AppLocadora {

	private static final String driver = "com.mysql.cj.jdbc.Driver";

	private static final String servidor = "localhost:3306";

	private static final String banco = "teste";

	private static final String timezone = "?useTimezone=true&serverTimezone=UTC";

	private static final String url = "jdbc:mysql://" + servidor + "/" + banco + timezone;

	private static final String usuario = "root";

	private static final String senha = "";



	public static void main(String[] args) {

		Connection conexao = null;

		System.out.println("Chamou conexao");

		try {

			Class.forName(driver);



//connection = (Connection) DriverManager.getConnection(url, usuario, senha);

			conexao = DriverManager.getConnection(url, usuario, senha);

			System.out.println("A conexão está funcionando");

			// return connection;

		} catch (ClassNotFoundException | SQLException e) {

			System.out.println("O erro que deu foi:" + e);



			// return connection;

// throw new RuntimeException("Erro OCnexao",e);

		}

		System.out.println("Vamos em frente.......");

		int idusUario = 1;

		String nome = "josex";

//========================

		String sqlx = "SELECT * FROM user ";

		java.sql.Statement stmt = null;

		ResultSet resultSet = null;



		try {

			stmt = conexao.createStatement();

			resultSet = stmt.executeQuery(sqlx);

			System.out.println("chamar sql");

			while (resultSet.next()) { 

				int emailConta = resultSet.getInt("iduser");

				String nomeUser = resultSet.getString("nomeUser");

				String senhaConta = resultSet.getString("senhaUser");

				System.out.println("O nome do suarui é:" + nomeUser);

			 

			}



		} catch (SQLException e) {

			System.out.println("Erro na execução do Selelct " + sqlx+","+ e);



		}

		System.out.println("OK");

	}

//========================

	

}