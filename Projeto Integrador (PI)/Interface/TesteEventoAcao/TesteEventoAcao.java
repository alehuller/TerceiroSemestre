package TesteEventoAcao;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
/**
 * TesteEventoAcao
 */
public class TesteEventoAcao extends JFrame implements ActionListener {
    JLabel l1;
    JButton b1, b2;
    int i1, i2;
    public TesteEventoAcao() {
        setTitle("Teste Evento Ação");
        setSize(350,150);
        getContentPane().setLayout(null);
        getContentPane().setBackground(new Color(122,120,255));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        i1 = i2 = 0;
        b1 = new JButton("Gravar");
        b1.setBounds(10,10,100,30);
        b1.addActionListener(this);
        b2 = new JButton("Sair");
        b2.setBounds(120,10,100,30);
        b2.addActionListener(this);
        l1 = new JLabel("Pressione os botões");
        l1.setBounds(5, 50, 220, 20);
        getContentPane().add(b1);
        getContentPane().add(b2);
        getContentPane().add(l1);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            l1.setText("Botão gravar pressionado " + ++i1 + " vez(es)");
        }
        if (e.getSource() == b2) {
            l1.setText("Botão sair pressionado " + ++i2 + " vez(es)");
        }        
    }

    public static void main(String[] args) {
        new TesteEventoAcao();
    }
    
}