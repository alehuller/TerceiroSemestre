/*Integrantes do Grupo:
 * Alejandro Huller, Barbara de Argolo, Caroline Stelitano, Lucas da Silva, Victor Hugo Enriquetto.
*/
package Faculdade;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Menu extends JFrame implements ActionListener{
	JLabel vazio;
	JMenuBar barraMenu;
	JMenu cadastro, alteracao, impressao, exclusao;
	JMenuItem professorCadastro, alunoCadastro, professorAlteracao, alunoAlteracao, professorImpressao, alunoImpressao, professorExclusao, alunoExclusao;
	
	public static void main (String[] args) {
		new Menu();
	}
	
	Menu() {
		setTitle("Faculdade");
		setSize(800, 600);
		vazio = new JLabel(" ");
		
		barraMenu = new JMenuBar();
		setJMenuBar(barraMenu);
		
		cadastro = criarMenu("Cadastro", 'c');
		alteracao = criarMenu("Alteração", 'a');
		impressao = criarMenu("Impressão", 'i');
		exclusao = criarMenu("Exclusão", 'e');
		
		professorCadastro = criarItem("Professor", 'p', cadastro);
		alunoCadastro = criarItem("Aluno", 'a', cadastro);
		professorAlteracao = criarItem("Professor", 'p', alteracao);
		alunoAlteracao = criarItem("Aluno", 'a', alteracao);
		professorImpressao = criarItem("Professor", 'p', impressao);
		alunoImpressao = criarItem("Aluno", 'a', impressao);
		professorExclusao = criarItem("Professor", 'p', exclusao);
		alunoExclusao = criarItem("Aluno", 'a', exclusao);
		
		add(barraMenu);
		add(vazio);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private JMenu criarMenu(String texto, char c) {
		JMenu item = new JMenu(texto);
		item.setMnemonic(c);
		item.addActionListener(this);
		barraMenu.add(item);
		return item;
		
	}
	
	private JMenuItem criarItem(String texto, char c, JMenu menu) {
		JMenuItem item = new JMenuItem(texto);
		item.setMnemonic(c);
		item.addActionListener(this);
		menu.add(item);
		return item;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == professorCadastro) {
			 new CadastroProfessor();
		}
		else if(e.getSource() == alunoCadastro) {
			new CadastroAluno();
		}
		else if(e.getSource() == professorAlteracao) {
			new AlteracaoProfessor();
		}
		else if(e.getSource() == alunoAlteracao) {
			new AlteracaoAluno();
		}
		else if(e.getSource() == professorImpressao) {
			JOptionPane.showMessageDialog(null, "Impresso no Console!");
			new ImpressaoProfessor();
		}
		else if(e.getSource() == alunoImpressao) {
			JOptionPane.showMessageDialog(null, "Impresso no Console!");
			new ImpressaoAluno();
		}
		else if(e.getSource() == professorExclusao) {
			new ExclusaoProfessor();
		}
		else if(e.getSource() == alunoExclusao) {
			new ExclusaoAluno();
		}
	}

}
