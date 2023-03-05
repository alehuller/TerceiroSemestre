package Interface;
import java.awt.*;
import javax.swing.*;

class Interface extends JFrame {
    public Interface() {
        Container c = getContentPane();
        setTitle("Primeira Janela Swing");
        int l = Integer.parseInt(JOptionPane.showInputDialog("Digite a largura da Janela: "));
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura da Janela: "));
        setSize(l, a);
        getContentPane().setLayout(null);
        int r = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para vermelho: "));
        int g = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para vermelho: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para vermelho: "));
        c.setBackground(new Color(r, g, b));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        centralizar();
    }


    public static void main(String[] args) {
        new Interface();
    }

    public void centralizar() {
        // obetem a altura e largura da resolucao video
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        // obtem a altura e largura da minha janela
        Dimension janela = getSize();
        if (janela.height > screen.height)
            setSize(janela.width, screen.width);
        if (janela.width > screen.width)
            setSize(screen.width, janela.height);
        setLocation((screen.width - janela.width) / 2, (screen.height - janela.height) / 2);
    }
}