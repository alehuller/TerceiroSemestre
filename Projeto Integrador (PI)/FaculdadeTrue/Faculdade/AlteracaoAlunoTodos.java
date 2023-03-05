package Faculdade;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlteracaoAlunoTodos extends JFrame implements ActionListener {
	JButton btnOk, btnCancel;
	JLabel nome, ra, rg;
	JTextField txtNome, txtRa, txtRg;
	
	AlteracaoAlunoTodos() {
		setTitle("Alterar dados do Aluno");
		setSize(400, 150);
		
		GridLayout g1 = new GridLayout(4, 1, 1, 2);
		getContentPane().setLayout(g1);
		
		JLabel nome = criarRotulo("Nome: ");
		txtNome = criarTexto();
		JLabel ra = criarRotulo("RA: ");
		txtRa = criarTexto();
		JLabel rg = criarRotulo("RG: ");
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
				Aluno novoAlteracao = new Aluno(txtNome.getText(), txtRa.getText(), txtRg.getText());
				alterarDados(novoAlteracao);
				this.dispose();
			}
		}
		else if(e.getSource() == btnCancel) {
			this.dispose();
		}
	}

	private void alterarDados(Aluno novoAlteracao) {
		try {
			String raAluno = JOptionPane.showInputDialog("Digite o RA do aluno a alterar: ");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/faculdade", "root", "1234");
			PreparedStatement ps = cn.prepareStatement("UPDATE aluno SET" + " raaluno = ?, nomealuno = ?, rgaluno = ? WHERE raaluno = ?");
			ps.setString(1, novoAlteracao.getRa());
			ps.setString(2, novoAlteracao.getNome());
			ps.setString(3, novoAlteracao.getRg());
			ps.setString(4, raAluno);
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "Aluno alterado com sucesso!");
			ps.close();
			cn.close();
		}
		catch (SQLException e) {
			System.out.println("Falha na alteração!");
			e.printStackTrace();
		}
	}
}

