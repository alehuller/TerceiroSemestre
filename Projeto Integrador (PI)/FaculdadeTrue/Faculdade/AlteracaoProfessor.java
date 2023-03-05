package Faculdade;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AlteracaoProfessor extends JFrame implements ActionListener{
	private JRadioButton nome, rgf, rg, todos;
	private JLabel texto;
	private Container c;
	
	AlteracaoProfessor() {
		ImpressaoProfessor.ConsultaProfessores();
		setTitle("Alteração");
		c = getContentPane();
		texto = new JLabel("Escolha o parâmetro que deseja mudar");
		c.setLayout(new FlowLayout());
		c.add(texto);
		nome = adicRadio("Nome", false);
		rgf = adicRadio("RGF", false);
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
			new AlteracaoProfessorNome();
		}
		else if(e.getSource() == rgf) {
			new AlteracaoProfessorRgf();
		}
		else if(e.getSource() == rg) {
			new AlteracaoProfessorRg();
		}
		else if(e.getSource() == todos) {
			new AlteracaoProfessorTodos();
		}
	}
}
