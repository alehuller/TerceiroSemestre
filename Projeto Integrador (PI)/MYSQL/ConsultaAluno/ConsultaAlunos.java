package ConsultaAluno;
import java.sql.*;
public class ConsultaAlunos {
	public static void main(String[] args) {        
		ConsultaAlunos alunos = new ConsultaAlunos();
		alunos.consultarAlunos();	  
	}

	public void consultarAlunos() {
		try {
			Connection cn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/senac", "root", "");
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery(
					"SELECT alunoID, alunoNome, alunoTelefone FROM alunos");
			while (rs.next()) {
				Aluno novo = new Aluno();
				novo.setId(rs.getInt("alunoID"));
				novo.setNome(rs.getString("alunoNome"));
				novo.setTelefone(rs.getString("alunoTelefone"));
				System.out.println(novo);
			}
			rs.close();
			st.close();
			cn.close();
		} catch (SQLException e) {
			System.out.println("Falha ao ler os registros." + "\n" + e);
		}

	}
}