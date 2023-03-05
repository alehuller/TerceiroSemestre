package Faculdade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class ImpressaoProfessor {
	 ImpressaoProfessor() {
		 ConsultaProfessores();
	 }
	 
	 public static void ConsultaProfessores() {
		 try {
			 Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/faculdade", "root", "1234");
			 Statement st = cn.createStatement();
			 ResultSet rs = st.executeQuery("SELECT rgprofessor, nomeprofessor, rgfprofessor FROM professor");
			 while (rs.next()) {
				 Professor novoProfessor = new Professor();
				 novoProfessor.setRg(rs.getString("rgprofessor"));
				 novoProfessor.setNome(rs.getString("nomeprofessor"));
				 novoProfessor.setRgf(rs.getString("rgfprofessor"));
				 System.out.print(novoProfessor);
			 }
			 rs.close();
			 st.close();
			 cn.close();
		 }
		 catch (SQLException e) {
			 System.out.println("Falha na impressão");
			 System.out.println(e);
		 }
	 }
}
