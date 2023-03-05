package Faculdade;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CadastroProfessor extends JFrame implements ActionListener {
	JButton btnOk, btnCancel;
	JLabel nome, rgf, rg;
	JTextField txtNome, txtRgf, txtRg;
	
	CadastroProfessor() {
		setTitle("Cadastro de Professor");
		setSize(400, 200);
		
		GridLayout g1 = new GridLayout(4, 1, 1, 2);
		getContentPane().setLayout(g1);
		
		JLabel nome = criarRotulo("Nome: ");
		txtNome = criarTexto();
		JLabel rgf = criarRotulo("RGF: ");
		txtRgf = criarTexto();
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
				Professor novoProfessor = new Professor(txtNome.getText(), txtRgf.getText(), txtRg.getText());
				gravarDados(novoProfessor);
				limparCampos();
			}
		}
		else if(e.getSource() == btnCancel) {
			this.dispose();
		}
	}
	
	private void limparCampos() {
		txtNome.setText("");
		txtRgf.setText("");
		txtRg.setText("");
	}
	
	private void gravarDados(Professor novoProfessor) {
		try {
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/faculdade", "root", "1234");
			PreparedStatement ps = cn.prepareStatement("INSERT INTO professor(rgprofessor, nomeprofessor, rgfprofessor)" + "VALUES (?, ?, ?)");
			ps.setString(1, novoProfessor.getRg());
			ps.setString(2, novoProfessor.getNome());
			ps.setString(3, novoProfessor.getRgf());
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "Professor cadastrado com sucesso!");
			ps.close();
			cn.close();
		}
		catch(SQLException e) {
			System.out.println("Falha no cadastro!");
			e.printStackTrace();
		}
	}
}
