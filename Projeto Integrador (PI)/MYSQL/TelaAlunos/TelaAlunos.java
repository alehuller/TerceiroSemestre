package nov22.exercicio;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.*;
import nov22.Aluno;

public class TelaAlunos extends JFrame implements ActionListener{
	JLabel nome, telefone;
	JTextField txtNome, txtTelefone;
	JButton gravar, alterar, excluir, consultar;
	
	public static void main(String[] args) {
		new TelaAlunos();
	}	
	
	public TelaAlunos() {
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		setLayout(new GridLayout(4,2,5,5));
		getContentPane().setBackground(new Color(201, 233, 245));;
		
		nome = criarRotulo(" Nome: ");
		txtNome = criarTexto();
		
		telefone = criarRotulo(" Telefone: ");
		txtTelefone = criarTexto();
		
		gravar = criarBotao("Gravar", 'G');
		consultar = criarBotao("Consultar", 'o');
		alterar = criarBotao("Alterar", 'A');	
		excluir = criarBotao("Excluir", 'E');		
		
		
		setTitle("Cadastro de Alunos");
		setSize((int)(screen.width*0.7), (int)(screen.height*0.4));
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private JButton criarBotao(String texto , char atalho) {
		JButton botao = new JButton(texto);
		botao.setMnemonic(atalho);
		botao.addActionListener(this);
		add(botao);
		return botao;
	}
	private JTextField criarTexto() {
		JTextField texto = new JTextField("", 40);
		texto.setFont(new Font("Times new Roman", Font.PLAIN, 18));
		add(texto);
		return texto;
	}
	private JLabel criarRotulo(String texto) {
		JLabel rotulo = new JLabel(texto);
		rotulo.setFont(new Font("Times new Roman", Font.BOLD, 18));
		rotulo.setForeground(Color.blue);
		add(rotulo);
		return rotulo;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==gravar) {
			int resp=JOptionPane.showConfirmDialog(null, 
					"Confirma a gravação?");
			if(resp==0)
			{
				Aluno novo = new Aluno(txtNome.getText(), 					txtTelefone.getText());
				gravarDados(novo);
				limparCampos();
			}
		}
//		else if(e.getSource()==cancelar) {
//			int resp=JOptionPane.showConfirmDialog(null, 
//					"Confirma o cancelamento?");
//			if(resp==0)
//			{
//				dispose();
//			}
//		}
		
	}
	private void limparCampos() {
		txtTelefone.setText("");
		txtNome.setText("");			
	}
	public void gravarDados(Aluno novo) {
	try {
        Connection cn = DriverManager.getConnection(
      "jdbc:mysql://localhost:3306/aulas","root", "");

       PreparedStatement ps = cn.prepareStatement(
       "INSERT INTO alunos(alunosNome, alunosTelefone) "
       + " VALUES (?, ?)");
        ps.setString(1, novo.getNome());
        ps.setString(2, novo.getTelefone());
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