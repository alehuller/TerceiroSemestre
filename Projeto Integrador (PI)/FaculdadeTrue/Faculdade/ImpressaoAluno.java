package Faculdade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class ImpressaoAluno {
	 ImpressaoAluno() {
		 ConsultaAlunos();
	 }
	 
	 public static void ConsultaAlunos() {
		 try {
			 Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/faculdade", "root", "1234");
			 Statement st = cn.createStatement();
			 ResultSet rs = st.executeQuery("SELECT raaluno, nomealuno, rgaluno FROM aluno");
			 while (rs.next()) {
				 Aluno novo = new Aluno();
				 novo.setRa(rs.getString("raaluno"));
				 novo.setNome(rs.getString("nomealuno"));
				 novo.setRg(rs.getString("rgaluno"));
				 System.out.print(novo);
			 }
			 rs.close();
			 st.close();		 
		}
		 catch (SQLException e) {
			 System.out.println("Falha na impressão");
			 System.out.println(e);
		 }
	 }
}
