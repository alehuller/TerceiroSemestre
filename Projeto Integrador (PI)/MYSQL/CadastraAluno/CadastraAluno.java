package CadastraAluno;
import java.sql.*;
import javax.swing.JOptionPane;
public class CadastraAluno {
   public static void main(String[] args) { 
        try {
            Connection cn = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/aulas","root", "");

           PreparedStatement ps = cn.prepareStatement(
           "INSERT INTO alunos(alunosNome, alunosTelefone) "
           + " VALUES (?, ?)");
            ps.setString(1, JOptionPane.showInputDialog(
            		"Digite o nome do Aluno"));
            ps.setString(2, JOptionPane.showInputDialog(
            		"Digite o telefone do Aluno"));
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, 
            	"Aluno cadastrado com sucesso.");
            ps.close();
            cn.close();
            System.out.println("Conexão encerrada.");            
        } catch (SQLException e) {
            System.out.println(
            "Falha ao tentar gravar o Aluno.");
            e.printStackTrace();
        }
    }
}
