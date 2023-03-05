package Faculdade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ExclusaoProfessor {
	ExclusaoProfessor() {
		ImpressaoProfessor.ConsultaProfessores();
		ExcluirProfessor();
	}
	
	private void ExcluirProfessor() {
		try {
			String rgProfessor = JOptionPane.showInputDialog("Digite o RG do professor a apagar: ");
			if(rgProfessor != null) {
				Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/faculdade", "root", "1234");
				PreparedStatement pstm = cn.prepareStatement("DELETE FROM professor WHERE rgprofessor = ?");
				pstm.setString(1, rgProfessor);
				pstm.execute();
				JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
			}
			else {
				JOptionPane.showMessageDialog(null, "Nada foi digitado!");
			}
		}
		catch (SQLException e) {
			System.out.println("Falha na exclusão!");
			System.out.println(e);
		}
	}
}
