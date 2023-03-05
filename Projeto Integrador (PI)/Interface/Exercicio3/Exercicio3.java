package Exercicio3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Exercicio3 extends JFrame implements ActionListener {
	JButton btnOk, btnCancelar;
	JLabel nome, endereco, telefone, cpf, rg;
	JTextField txtNome, txtEndereco, txtTelefone, txtCpf, txtRg;
	public Exercicio3(){
		setTitle("Formulário");
		setSize(310,170);
		GridLayout gl = new GridLayout(6,2,1,3);
		getContentPane().setLayout(gl);		
		JLabel nome =  criarRotulo(" Nome: ");
		txtNome =  criarTexto();
		endereco =  criarRotulo(" Endereco: ");
		txtEndereco = criarTexto();
		telefone = criarRotulo(" Telefone: ");
		txtTelefone = criarTexto();
		cpf = criarRotulo(" CPF: ");
		txtCpf = criarTexto();
		rg = criarRotulo(" RG: ");
		txtRg = criarTexto();
		btnOk = criarBotao("Ok", 'O');
		btnCancelar = criarBotao("Cancelar", 'C');
		getContentPane().add(btnCancelar);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
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
	public static void main(String[] args) {
		new Exercicio3();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnOk) {
			int resp=JOptionPane.showConfirmDialog(null, "Confirma a gravação?");
			if(resp==0)
			{
				JOptionPane.showMessageDialog(null, "Dados gravados com sucesso!!");
				limparCampos();
			}
		}
		else if(e.getSource()==btnCancelar) {
			int resp=JOptionPane.showConfirmDialog(null, "Confirma o encerramento?");
			if(resp==0)
			{
				System.exit(0);
			}
		}		
	}
	private void limparCampos() {
		txtCpf.setText("");
		txtEndereco.setText("");
		txtTelefone.setText("");
		txtNome.setText("");
		txtRg.setText("");
		txtCpf.setText("");		
	}
}