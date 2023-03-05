package Exercicio2;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class Exercicio2 extends JFrame {
    JLabel nome, sexo, falecido;
    JTextField fieldNome;
    JComboBox sexoCombo, falecidoCombo;

    public static void main(String[] args) {
        new Exercicio2();
    }

    Exercicio2() {
        setTitle("ATUALIZA DADOS CADASTRAIS");
        setSize(500, 160);
        getContentPane().setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(190,190,190));
        nome = criarRotulo("Nome", 50, 25, 100, 50);
        sexo = criarRotulo("Sexo", 50, 70, 100, 50);
        falecido = criarRotulo("Falecido", 250, 70, 100, 50);
        String[] sexo = {"Masculino", "Feminino"};
        String[] falecido = {"Sim", "Não"};
        sexoCombo = new JComboBox(sexo);
        sexoCombo.setBounds(125, 70, 100, 25);
        falecidoCombo = new JComboBox(falecido);
        falecidoCombo.setBounds(375, 70, 50, 25);
        fieldNome = criarCaixaTexto(125, 25, 300, 25);
        getContentPane().add(sexoCombo);
        getContentPane().add(falecidoCombo);
        getContentPane().add(fieldNome);
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

    private JTextField criarCaixaTexto(int x, int y, int w, int h) {
		JTextField texto = new JTextField();
		texto.setLocation(x, y);
		texto.setSize(w, h);
		//texto.setForeground(new Color(0,0,0));
		texto.setFont(new Font("Courier new", Font.BOLD, 20));
		texto.setHorizontalAlignment(0);
		add(texto);
		return texto;
	}

}
