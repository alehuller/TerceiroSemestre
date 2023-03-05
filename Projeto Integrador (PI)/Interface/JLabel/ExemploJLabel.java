package JLabel;

import java.awt.*;
import javax.swing.*;

public class ExemploJLabel extends JFrame {
    JLabel jl1, jl2;

    public ExemploJLabel() {
        Container c = getContentPane();
        setTitle("Primeira Janela Swing");
        setSize(600, 400);
        getContentPane().setLayout(null);
        c.setBackground(new Color(125, 255, 255));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
        jl1 = criarRotulo("Nome: ", 10, 10, 200, 30);
        jl2 = criarRotulo("Endereco: ", 10, 40, 200, 30);
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

    public static void main(String[] args) {
        new ExemploJLabel();
    }
}
