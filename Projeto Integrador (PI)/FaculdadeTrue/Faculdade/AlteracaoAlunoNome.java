package Faculdade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class AlteracaoAlunoNome{
	AlteracaoAlunoNome() {
		AlterarAlunoNome();
	}
	
	private void AlterarAlunoNome() {
		try {
			String raAluno = JOptionPane.showInputDialog("Digite o RA do aluno a alterar: ");
			if (raAluno == null) {
				JOptionPane.showMessageDialog(null, "Nada foi digitado. Reinicie a aplicação.");
				System.exit(0);
			}
			String nomeAluno = JOptionPane.showInputDialog("Digite o novo nome: ");
			if(nomeAluno == null) {
				JOptionPane.showMessageDialog(null, "Nada foi digitado. Reinicie a aplicação.");
				System.exit(0);
			}
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/faculdade", "root", "1234");
			PreparedStatement pstm = cn.prepareStatement("UPDATE aluno SET" + " nomealuno = ? WHERE raaluno = ?");
			pstm.setString(1, nomeAluno);
			pstm.setString(2, raAluno);
			pstm.execute();
			JOptionPane.showMessageDialog(null, "Aluno alterado com sucesso!");
		}
		catch (SQLException e) {
			System.out.println("Falha na alteração!");
			System.out.println(e);
		}
	}
}
