package Faculdade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ExclusaoAluno {
	ExclusaoAluno() {
		ImpressaoAluno.ConsultaAlunos();
		ExcluirAluno();
	}
	
	private void ExcluirAluno() {
		try {
			String raAluno = JOptionPane.showInputDialog("Digite o RA do aluno a apagar: ");
			if(raAluno != null) {
				Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/faculdade", "root", "1234");
				PreparedStatement pstm = cn.prepareStatement("DELETE FROM aluno WHERE raaluno = ?");
				pstm.setString(1, raAluno);
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
