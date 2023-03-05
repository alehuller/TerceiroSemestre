package ApagaAlunos;

import java.sql.*;

import javax.swing.JOptionPane;

public class ApagaAlunos {
	public static void main(String[] args) {
		ApagaAlunos novo = new ApagaAlunos();
		try {
			novo.apagarRegistro();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void apagarRegistro() throws Exception {
		Connection cn = null;
		PreparedStatement pstm = null;
		try {
			int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do aluno a apagar: "));
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/senac" , "root", "");
			pstm = cn.prepareStatement("DELETE FROM alunos WHERE alunoID = ?");
			pstm.setInt(1, id);
			pstm.execute();
		}
		catch (SQLException e) {
			cn.rollback();
			throw new Exception("Falha ao acessar base de dados!", e);
		}
		finally {
			pstm.close();
			cn.close();
		}
	}
}
