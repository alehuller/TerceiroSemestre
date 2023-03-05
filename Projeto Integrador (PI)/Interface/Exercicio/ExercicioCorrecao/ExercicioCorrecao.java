package ExercicioCorrecao;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class ExercicioCorrecao extends JFrame implements ActionListener{
	JButton btnOk, btnCancelar;
	JTextField campoUsuario;
	JPasswordField campoSenha;
	JLabel user, senha;
	
	public ExercicioCorrecao(){
		setTitle("Login Usuario");
		setSize(300,110);
		GridLayout gl = new GridLayout(3,2,1,1);
		getContentPane().setBackground(new Color(64,219,111));
		getContentPane().setLayout(gl);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		user = criarRotulo("Usuario: ");
		campoUsuario = new JTextField();
		getContentPane().add(campoUsuario);
		senha = criarRotulo("Senha: ");
		campoSenha = new JPasswordField();
		getContentPane().add(campoSenha);

		btnOk = criarBotao("OK", 'O');		
		btnCancelar = criarBotao("Cancelar", 'C');		
		setVisible(true);
	}
	private JLabel criarRotulo(String texto) {
		JLabel rotulo = new JLabel(texto);
		rotulo.setFont(new Font("Times New Roman", Font.BOLD, 18));
		rotulo.setForeground(Color.BLUE);
		add(rotulo);		
		return rotulo;
	}
	private JButton criarBotao(String texto, char c) {
		JButton botao = new JButton(texto);
		botao.setMnemonic(c);
		botao.addActionListener(this);
		add(botao);		
		return botao;
	}
	public void actionPerformed(ActionEvent e){
		if (e.getSource() == btnOk){
			String usu = campoUsuario.getText();
			String senha = String.valueOf(
					campoSenha.getPassword());
			if (usu.equals("Marcos") && senha.equals("123456")){
				JOptionPane.showMessageDialog(null, usu + ", "
						+ "você foi logado ao sistema.");
				System.exit(0);
			}
			else{
				JOptionPane.showMessageDialog(null, 
				"Usuario ou senha invalidos. Tente novamente");
			}
		}
		if (e.getSource() == btnCancelar){
			System.exit(0);
		}
	}
	public static void main(String[] args) {
		new ExercicioCorrecao();
	}
}
