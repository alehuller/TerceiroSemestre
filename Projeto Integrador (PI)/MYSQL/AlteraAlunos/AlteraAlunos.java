package AlteraAlunos;
import java.sql.*;

import javax.swing.JOptionPane;

import ConsultaAluno.ConsultaAlunos;
public class AlteraAlunos {
	public static void main(String[] args) {  
		ConsultaAlunos alunos = new ConsultaAlunos();
		alunos.consultarAlunos();		
		int id = Integer.parseInt(JOptionPane.showInputDialog(
				"Digite o ID do aluno a alterar: "));
		String nome = JOptionPane.showInputDialog(
				"Digite o Nome do aluno: ");
		String telefone = JOptionPane.showInputDialog(
				"Digite o Telefone do aluno: ");
		try {		
			Connection cn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/senac", "root", "");            
			PreparedStatement pstm = cn.prepareStatement("UPDATE alunos SET " +
				 " alunoNome = ?, alunoTelefone = ? WHERE alunoID = ?");			
			pstm.setString(1, nome);
			pstm.setString(2, telefone);
			pstm.setInt(3, id);			
			pstm.execute();
			System.out.println("Aluno alterado com sucesso.");
			alunos.consultarAlunos();

			pstm.close();
			cn.close();
			System.out.println("Conexão encerrada.");

		} catch (SQLException e) {
			System.out.println("Falha ao realizar a operação.");
			e.printStackTrace();
		}
	}
}
