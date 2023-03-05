package TesteJPanel;
import java.awt.*;
import javax.swing.*;

public class TesteJPanel extends JFrame {
    JButton b1, b2;
    JPanel p1, p2;
    public TesteJPanel() {
        setTitle("Teste JPanel");
        setSize(300,200);
        //getContentPane().setLayout(new GridLayout(2,1,5,5));
        getContentPane().setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        p1 = criarPainel(Color.BLUE, 100, 10, 170, 70);
        p2 = criarPainel(Color.YELLOW, 100, 90, 170, 70);

        b1 = new JButton("Gravar");
        b1.setBounds(50, 30, 100, 30);
        b2 = new JButton("Sair");
        b2.setBounds(50, 30, 100, 30);

        p1.add(b1);
        p2.add(b2);
        getContentPane().add(p1);
        getContentPane().add(p2);
        setVisible(true);
    }

    private JPanel criarPainel(Color cor, int x, int y, int w, int h) {
        JPanel p = new JPanel();
        p.setLayout(null);
        p.setBounds(x, y, w, h);
        p.setBackground(cor);
        add(p);
        return p;
    }

    public static void main(String[] args) {
        new TesteJPanel();
    }
}
