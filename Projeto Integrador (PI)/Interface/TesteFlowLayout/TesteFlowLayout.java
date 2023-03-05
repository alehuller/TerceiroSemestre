package TesteFlowLayout;


import java.awt.*;
import javax.swing.*;

public class TesteFlowLayout extends JFrame {
    public TesteFlowLayout() {
        setTitle("Teste FlowLayout");
        setSize(300, 120);
        getContentPane().setBackground(new Color(255,255,255));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        //Cria um flowlayout alinhando seus componentes à esquerda e definindo o espaçcamento horizontal e vertical entre eles.
        FlowLayout f1 = new FlowLayout(FlowLayout.LEFT, 10, 10);
        getContentPane().setLayout(f1);
        JButton b1 = new JButton("Botao 1");
        JButton b2 = new JButton("Botao 2");
        JButton b3 = new JButton("Botao 3");
        JButton b4 = new JButton("Botao 4");
        JButton b5 = new JButton("Botao 5");
        getContentPane().add(b1);
        getContentPane().add(b2);
        getContentPane().add(b3);
        getContentPane().add(b4);
        getContentPane().add(b5);
        setVisible(true);
    }
    public static void main(String[] args) {
        new TesteFlowLayout();
    }
}
