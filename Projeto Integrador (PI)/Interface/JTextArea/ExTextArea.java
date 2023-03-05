package JTextArea;
import java.awt.*;	import java.awt.event.*;  import javax.swing.*;
public class ExTextArea extends JFrame implements ActionListener{	
	JTextField texto;	
	JTextArea area1,area2;
	JButton b1, b2;
	public static void main(String args[])	{	
		new ExTextArea ();		
	}
	ExTextArea ()	{	
		setTitle("Uso de Área de texto");
		setSize(600,400);
		setLayout(new GridLayout(5, 1));
		texto = new JTextField();
		texto.setHorizontalAlignment(SwingConstants.CENTER);
		texto.setFont(new Font("Arial",Font.PLAIN,20)); 
		texto.setForeground(new Color(26,72,17));
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(1,2));	
		
		texto.addActionListener(this);
		setLayout(new GridLayout(6, 1, 3, 3));
		area1 = new JTextArea("Editor de Texto",3 , 80);
		area1.setBackground(new Color(238,238,198));
		
		area2 = new JTextArea(3 , 80);
		area2.setBackground(new Color(155,238,245));
		
		b1 = criarBotao("Copiar Tudo" , 'T');
		b2 = criarBotao("Copiar Seleção" , 'S');
		
		p1.add(b1);
		p1.add(b2);
		
		add(area1);
		add(texto);  	
		add(p1);
		add(area2); 
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);	
		}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			area2.setText(area1.getText());
		}
		else if(e.getSource()==b2) {
			area2.setText(area1.getSelectedText());
		}
		else if(e.getSource()==texto) {
			area1.setText(texto.getText());
		}	
	}
	
	private JButton criarBotao(String texto, char c) {
		JButton botao = new JButton(texto);
		botao.setMnemonic(c);
		botao.addActionListener(this);
		add(botao);
		return botao;
	}	
}