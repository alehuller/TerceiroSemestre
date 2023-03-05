package Faculdade;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AlteracaoAluno extends JFrame implements ActionListener{
	private JRadioButton nome, ra, rg, todos;
	private JLabel texto;
	private Container c;
	
	AlteracaoAluno() {
		ImpressaoAluno.ConsultaAlunos();
		setTitle("Alteração");
		c = getContentPane();
		texto = new JLabel("Escolha o parâmetro que deseja mudar");
		c.setLayout(new FlowLayout());
		c.add(texto);
		nome = adicRadio("Nome", false);
		ra = adicRadio("RA", false);
		rg = adicRadio("RG", false);
		todos = adicRadio("Todos", false);
		setSize(300,100);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	
	private JRadioButton adicRadio(String texto, boolean b) {
		JRadioButton radioBot = new JRadioButton(texto, b);
		radioBot.addActionListener(this);
		c.add(radioBot);
		return radioBot;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == nome) {
			new AlteracaoAlunoNome();
		}
		else if(e.getSource() == ra) {
			new AlteracaoAlunoRa();
		}
		else if(e.getSource() == rg) {
			new AlteracaoAlunoRg();
		}
		else if(e.getSource() == todos) {
			new AlteracaoAlunoTodos();
		}
	}
}
