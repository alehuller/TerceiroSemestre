package View;

import javax.swing.JOptionPane;

public class InteracaoUsuario {
	public void boasVindas() {
		System.out.println("Bem vindo ao Sistema");
	}
	public String entradaUsuario() {
		String nome = (JOptionPane.showInputDialog(null, "Insira o seu nome: "));
		return nome;
		
	}
}
