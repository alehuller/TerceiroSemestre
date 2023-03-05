package Faculdade;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CadastroAluno extends JFrame implements ActionListener {
	JButton btnOk, btnCancel;
	JLabel nome, ra, rg;
	JTextField txtNome, txtRa, txtRg;
	
	CadastroAluno() {
		setTitle("Cadastro de Aluno");
		setSize(400, 200);
		
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
			int resp = JOptionPane.showConfirmDialog(null, "Confirma a gravação?");
			if(resp == 0) {
				Aluno novo = new Aluno(txtNome.getText(), txtRa.getText(), txtRg.getText());
				gravarDados(novo);
				limparCampos();
			}
		}
		else if(e.getSource() == btnCancel) {
			this.dispose();
		}
	}
	
	private void limparCampos() {
		txtNome.setText("");
		txtRa.setText("");
		txtRg.setText("");
	}
	
	private void gravarDados(Aluno novo) {
		try {
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/faculdade", "root", "1234");
			PreparedStatement ps = cn.prepareStatement("INSERT INTO aluno(raaluno, nomealuno, rgaluno)" + "VALUES (?, ?, ?)");
			ps.setString(1, novo.getRa());
			ps.setString(2, novo.getNome());
			ps.setString(3, novo.getRg());
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!");
			ps.close();
			cn.close();
		}
		catch (SQLException e) {
			System.out.println("Falha no cadastro!");
			e.printStackTrace();
		}
	}
}

