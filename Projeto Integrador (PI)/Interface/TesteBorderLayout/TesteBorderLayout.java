package TesteBorderLayout;

import java.awt.*;
import javax.swing.*;

public class TesteBorderLayout extends JFrame {
    public TesteBorderLayout() {
        setTitle("Teste BorderLayout");
        setSize(800, 600);
        getContentPane().setBackground(new Color(123, 123, 255));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        //Cria um borderlayout definindo o espaçamento horizontal e vertical entre cada uma das regiôes.
        BorderLayout bl = new BorderLayout(5,5);
        getContentPane().setLayout(bl);
        JButton b1 = new JButton("Botão Norte");
        JButton b2 = new JButton("Botão Sul");
        JButton b3 = new JButton("Botão Leste");
        JButton b4 = new JButton("Botão Oeste");
        JButton b5 = new JButton("Botão Centro");

        getContentPane().add(b1,BorderLayout.NORTH);
        getContentPane().add(b2,BorderLayout.SOUTH);
        getContentPane().add(b3,BorderLayout.EAST);
        getContentPane().add(b4,BorderLayout.WEST);
        getContentPane().add(b5,BorderLayout.CENTER);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TesteBorderLayout();
    }
}
