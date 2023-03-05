package JMenuItem;

import java.awt.*;	import java.awt.event.*;  import javax.swing.*;
public class ExMenus extends JFrame implements ActionListener{	
	JLabel texto;	
	JMenuBar barraMenu;
	JMenu arquivo, editar, exibir;
	JMenuItem novo, salvar, sair, copiar, recortar, colar, tudo, selecao;
	
	public static void main(String args[])	{	
		new ExMenus ();		
	}
	ExMenus ()	{	
		setTitle("Uso de Área de Menus");
		setSize(800,600);
		texto = new JLabel("O texto aparecerá aqui!!!");
		texto.setHorizontalAlignment(SwingConstants.CENTER);
		texto.setVerticalAlignment(SwingConstants.BOTTOM);
		texto.setFont(new Font("Arial",Font.PLAIN,30)); 
		texto.setForeground(Color.red);
		
		barraMenu = new JMenuBar();
		setJMenuBar(barraMenu);
		
		arquivo = new JMenu("Arquivo");
		arquivo.setMnemonic('A');
		editar = new JMenu("Editar");
		editar.setMnemonic('E');
		exibir = new JMenu("Exibir");
		exibir.setMnemonic('x');
		
		barraMenu.add(arquivo);
		barraMenu.add(editar);
		barraMenu.add(exibir);
		
		novo = criarItem("Novo", 'N', arquivo);
		salvar = criarItem("Salvar" , 'S', arquivo);
		sair = criarItem("Sair" , 'r', arquivo);
		
		copiar = criarItem("Copiar", 'C', editar);
		colar = criarItem("Colar", 'l', editar);
		recortar = criarItem("Recortar", 'R', editar);
		
		tudo = criarItem("Tudo", 'T', exibir);
		selecao = criarItem("Seleção", 'S', exibir);
		
		add(barraMenu);
		add(texto);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);	
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
		if(e.getSource()==sair) {
			texto.setText("Você clicou no Item de Menu Sair");
			int resp = JOptionPane.showConfirmDialog(
					null, "Confirma o encerramento?");
			if(resp==0)
				System.exit(0);
		}
		else if(e.getSource()==salvar) {
			texto.setText("Você clicou no Item de Menu Salvar");
			JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!!!");
		}
		else if(e.getSource()==novo) {
			texto.setText("Você clicou no Item de Menu Novo");
			JOptionPane.showMessageDialog(null, "Novo registro criado!!!");
		}	
		else if(e.getSource()==copiar) {
			texto.setText("Você clicou no Item de Menu Copiar");
			JOptionPane.showMessageDialog(null, "Texto copiado!!!");
		}
		else if(e.getSource()==colar) {
			texto.setText("Você clicou no Item de Menu Colar");
			JOptionPane.showMessageDialog(null, "Texto Colado!!!");
		}
		else if(e.getSource()==recortar) {
			texto.setText("Você clicou no Item de Menu Recortar");
			JOptionPane.showMessageDialog(null, "Texto recortado!!!");
		}
		else if(e.getSource()==tudo) {
			texto.setText("Você clicou no Item de Menu Tudo");				
		}
		else if(e.getSource()==selecao) {
			texto.setText("Você clicou no Item de Menu Seleção");				
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