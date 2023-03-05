package Exercicio;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Login extends JFrame implements ActionListener {
    JLabel usuario, senha;
	JTextField usuario2, senha2;
    JButton b1, b2;
    public Login() {
        setTitle("Login");
        setSize(510, 200);
        getContentPane().setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        usuario = criarRotulo("Usuário:", 35, 20, 100, 50);
        senha = criarRotulo("Senha:", 59, 60, 100, 50);
        usuario2 = criarCaixaTexto(140, 20, 300, 25);
        senha2 = criarCaixaTextoSenha(140, 60, 300, 25);
        b1 = new JButton("Ok");
        b1.setBounds(105,105,100,30);
        b1.addActionListener(this);
        b2 = new JButton("Cancelar");
        b2.setBounds(290,105,100,30);
        b2.addActionListener(this);
        add(b1);
        add(b2);
        setVisible(true);
    }

    private JLabel criarRotulo(String texto, int x, int y, int w, int h) {
        JLabel rotulo = new JLabel();
        rotulo.setText(texto);
        rotulo.setLocation(x, y);
        rotulo.setSize(w, h);
        rotulo.setBackground(new Color(255, 255, 255));
        rotulo.setForeground(new Color(0, 0, 0));
        rotulo.setFont(new Font("Courier new", Font.BOLD, 20));
        rotulo.setToolTipText("rotuloabel Exemplo");
        rotulo.setHorizontalAlignment(SwingConstants.LEFT);
        rotulo.setVerticalAlignment(SwingConstants.TOP);
        add(rotulo);
        return rotulo;
    }

    private JTextField criarCaixaTextoSenha(int x, int y, int w, int h) {
		JTextField texto = new JPasswordField();
		texto.setLocation(x, y);
		texto.setSize(w, h);
		//texto.setForeground(new Color(0,0,0));
		texto.setFont(new Font("Courier new", Font.BOLD, 20));
		texto.setToolTipText("Senha");
		texto.setHorizontalAlignment(0);
		add(texto);
		return texto;
	}

    private JTextField criarCaixaTexto(int x, int y, int w, int h) {
		JTextField texto = new JTextField();
		texto.setLocation(x, y);
		texto.setSize(w, h);
		//texto.setForeground(new Color(0,0,0));
		texto.setFont(new Font("Courier new", Font.BOLD, 20));
		texto.setToolTipText("Usuário");
		texto.setHorizontalAlignment(0);
		add(texto);
		return texto;
	}

    public static void main(String[] args) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String usuario = usuario2.getText();
        String senha = senha2.getText();
        if (e.getSource() == b1) {
            if (usuario.equals("Victor") && senha.equals("12345")) {
                JOptionPane.showMessageDialog(null, "Olá Victor, você realizou seu login com sucesso!");
            }
            else {
                JOptionPane.showMessageDialog(null, "Usuário inválido");
            }
        }
        if (e.getSource() == b2) {
            int resp = JOptionPane.showConfirmDialog(null, "Deseja cancelar o login?");
            if (resp == 0) {
                System.exit(0);
            }
        }
        
    } 
}
