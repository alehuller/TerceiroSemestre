package ExemploJTextField;

import java.awt.*; 
import javax.swing.*; 
public class ExemploJTextField extends JFrame{ 
	JLabel jl1, jl2;
	JTextField txtNome, txtTelefone;
	public ExemploJTextField()
	{ 
		Container c = getContentPane();
		setTitle("Primeira Janela Swing"); 
		setSize(600,400); 
		getContentPane().setLayout(null); 
		c.setBackground(new Color(125,255,255));
		
		jl1 = criarRotulo("Nome: " , 10 , 10, 200, 30);		
		jl2 = criarRotulo("Endereço: ", 10 , 40, 200 , 30);
		txtNome = criarCaixaTexto(210 , 10, 200, 30);		
		txtTelefone = criarCaixaTexto(210 , 40, 200 , 30);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setVisible(true); 
		setLocationRelativeTo(null);		
	} 
	private JTextField criarCaixaTexto(int x, int y, int w, int h) {
		JTextField texto = new JTextField();
		texto.setLocation(x, y);
		texto.setSize(w, h);
		//texto.setForeground(new Color(0,0,0));
		texto.setFont(new Font("Courier new", Font.BOLD, 20));
		texto.setToolTipText("texto Exemplo");
		texto.setHorizontalAlignment(0);
		add(texto);
		return texto;
	}
	public static void main(String [] args){ 
		new ExemploJTextField(); 
	}//FIM DO MAIN()
	public void centralizar(){
		//obtém a altura e largura da resolução vídeo
		Dimension screen =
		Toolkit.getDefaultToolkit().getScreenSize();
		//obtém a altura e largura da minha janela
		Dimension janela = getSize();
		if (janela.height > screen.height)
		setSize(janela.width, screen.height);
		if (janela.width > screen.width)
		setSize(screen.width, janela.height);
		setLocation((screen.width - janela.width)/2,
		(screen.height - janela.height)/2);
	}

    private JLabel criarRotulo(String texto, int x, int y, int w, int h) {
		JLabel rotulo = new JLabel();

		rotulo.setText(texto);
		rotulo.setLocation(x, y);
		rotulo.setSize(w, h);		
		rotulo.setFont(new Font("Courier new", Font.BOLD, 20));
		rotulo.setHorizontalAlignment(SwingConstants.LEFT);
		rotulo.setVerticalAlignment(SwingConstants.TOP);
		add(rotulo);
		return rotulo;
	}
}