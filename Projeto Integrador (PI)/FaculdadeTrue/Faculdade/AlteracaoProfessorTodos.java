package Faculdade;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlteracaoProfessorTodos extends JFrame implements ActionListener {
	JButton btnOk, btnCancel;
	JLabel nome, rgf, rg;
	JTextField txtNome, txtRgf, txtRg;
	
	AlteracaoProfessorTodos() {
		setTitle("Alterar dados do Professor");
		setSize(400, 150);
		
		GridLayout g1 = new GridLayout(4, 1, 1, 2);
		getContentPane().setLayout(g1);
		
		JLabel nome = criarRotulo("Nome: ");
		txtNome = criarTexto();
		JLabel rgf = criarRotulo("RGF: ");
		txtRgf = criarTexto();
		JLabel rg = criarRotulo("RGF: ");
		txtRg = criarTexto();
		
		btnOk = criarBotao("Ok", 'o');
		btnCancel = criarBotao("Cancel", 'c');
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	private JLabel criarRotulo(String texto) {
		JLabel rotulo = new JLabel(texto);
		rotulo.setFont(new Font("Times new Roman", Font.BOLD, 18));
		rotulo.setForeground(Color.blue);
		add(rotulo);
		return rotulo;
	}
	
	private JTextField criarTexto() {
		JTextField texto = new JTextField("", 40);
		texto.setFont(new Font("Times new Roman", Font.PLAIN, 18));
		add(texto);
		return texto;
	}
	
	private JButton criarBotao(String texto , char c) {
		JButton botao = new JButton(texto);
		botao.setMnemonic(c);
		botao.addActionListener(this);
		add(botao);
		return botao;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnOk) {
			int resp = JOptionPane.showConfirmDialog(null, "Confirma a alteração?");
			if(resp == 0) {
				Professor novoProfessorAlteracao = new Professor(txtNome.getText(), txtRgf.getText(), txtRg.getText());
				alterarDadosProfessor(novoProfessorAlteracao);
				this.dispose();
			}
		}
		else if(e.getSource() == btnCancel) {
			this.dispose();
		}
	}

	private void alterarDadosProfessor(Professor novoProfessorAlteracao) {
		try {
			String rgProfessor = JOptionPane.showInputDialog("Digite o RG do professor a alterar: ");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/faculdade", "root", "1234");
			PreparedStatement ps = cn.prepareStatement("UPDATE professor SET" + " rgprofessor = ?, nomeprofessor = ?, rgfprofessor = ? WHERE rgprofessor = ?");
			ps.setString(1, novoProfessorAlteracao.getRg());
			ps.setString(2, novoProfessorAlteracao.getNome());
			ps.setString(3, novoProfessorAlteracao.getRgf());
			ps.setString(4, rgProfessor);
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "Professor alterado com sucesso!");
			ps.close();
			cn.close();
		}
		catch (SQLException e) {
			System.out.println("Falha na alteração!");
			e.printStackTrace();
		}
	}
}

