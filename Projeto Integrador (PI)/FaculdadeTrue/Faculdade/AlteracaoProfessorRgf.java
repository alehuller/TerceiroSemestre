package Faculdade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class AlteracaoProfessorRgf {
	AlteracaoProfessorRgf() {
		AlterarProfessorRgf();
	}
	
	private void AlterarProfessorRgf() {
		try {
			String rgProfessor = JOptionPane.showInputDialog("Digite o RG do professor a alterar: ");
			if (rgProfessor == null) {
				JOptionPane.showMessageDialog(null, "Nada foi digitado. Reinicie a aplicação.");
				System.exit(0);
			}
			String rgfProfessor = JOptionPane.showInputDialog("Digite o novo RGF: ");
			if (rgfProfessor == null) {
				JOptionPane.showMessageDialog(null, "Nada foi digitado. Reinicie a aplicação.");
				System.exit(0);
			}
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/faculdade", "root", "1234");
			PreparedStatement pstm = cn.prepareStatement("UPDATE professor SET" + " rgfprofessor = ? WHERE rgprofessor = ?");
			pstm.setString(1, rgfProfessor);
			pstm.setString(2, rgProfessor);
			pstm.execute();
			JOptionPane.showMessageDialog(null, "Aluno alterado com sucesso!");
		}
		catch (SQLException e) {
			System.out.println("Falha na alteração!");
			System.out.println(e);
		}
	}
}
