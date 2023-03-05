package Button;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class UsaBotoes extends JFrame implements ActionListener{    
    JButton gravar, sair;
    JTextField txtNome, txtRG;
    JLabel nome, rg;
    public UsaBotoes(){
        setTitle("Usando Botões");
        int l = 800;
        int a = 300;
        setSize(l , a);
        getContentPane().setLayout(null);
        int x=10, y=10, w=100, h=35;
        //1ª linha
        rg = criarRotulo("RG: ", x, y, w, h);
        txtRG = criarTexto(x+w, y, w+=200, h);
        
        //2ª linha
        x=10; 
        y=40;//define a linha
        w=100;
        h=35;        
        nome = criarRotulo("Nome: ", x, y, w, h);
        txtNome = criarTexto(x+w, y, w+=200, h);
        
        gravar = criarBotao("Gravar", (l/2-100), 200, 100, 50, 'G');
        sair = criarBotao("Sair", (l/2), 200, 100, 50, 'S');
        getContentPane().setBackground(new Color(205,245,201));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    private JButton criarBotao(String texto, int x, int y, int w, 
            int h, char c) {
        JButton b1 = new JButton(texto);
        b1.setBounds(x, y, w, h);
        b1.setBackground(new Color(0,120,170));
        b1.setForeground(Color.YELLOW);
        b1.setFont(new Font("Helvetica", Font.BOLD, 18));
//        b1.setToolTipText("Botao b1");
        b1.addActionListener(this);
        b1.setHorizontalAlignment(SwingConstants.CENTER);
        b1.setVerticalAlignment(SwingConstants.CENTER);
        b1.setMnemonic(c); 
        add(b1);
        return b1;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==gravar)
            JOptionPane.showMessageDialog(null, "Dados gravados!!");
        else if(e.getSource()==sair){
            int resp = JOptionPane.showConfirmDialog(null, 
                    "Confirma o encerramento?");
            if(resp==0)
                System.exit(0);
        }
    }    
    public static void main(String [] args){
	 new UsaBotoes();
  }

    private JLabel criarRotulo(String texto, int x, int y, int w, int h) {
        JLabel l1 = new JLabel(texto);
        l1.setBounds(x, y, w, h);
        l1.setForeground(Color.BLUE);
        l1.setFont(new Font("Helvetica", Font.BOLD, 20));
        add(l1);
        return l1;
    }

    private JTextField criarTexto(int x, int y, int w, int h) {
        JTextField t1 = new JTextField();
        t1.setBounds(x, y, w, h);
        t1.setBackground(new Color(0,120,170));
        t1.setForeground(Color.YELLOW);
        t1.setFont(new Font("Helvetica", Font.BOLD, 18));        
        t1.addActionListener(this);
        t1.setHorizontalAlignment(SwingConstants.CENTER);
        add(t1);
        return t1;
    }
} 