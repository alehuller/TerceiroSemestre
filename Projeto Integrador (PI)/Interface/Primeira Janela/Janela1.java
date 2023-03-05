import java.awt.*;
import javax.swing.*;

class Janela1 extends JFrame {
    public Janela1() {
        Container c = getContentPane();
        //Título da janela
        setTitle("Primeira Janela Swing");
        //tamanho da janela- width-largura, heigth-altura
        setSize(270,100);
        //anula o layout padrão
        setLayout(null);
        //cor de fundo da janela no padrão RGB (Red Green Blue)
        c.setBackground(new Color(125,255,255));
        //provoca o termino da execução (encerra o programa)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        //centralizar();
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        new Janela1();
    }

    public void centralizar() {
        //obtém a altura e largura da resolução de vídeo
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        //obtém a altura e largura da minha janela
        Dimension janela = getSize();
        if (janela.height > screen.height) {
            setSize(janela.width, screen.height);
        }
        if (janela.width > screen.width) {
            setSize(screen.width, janela.height);
        }
        setLocation((screen.width - janela.width)/2, (screen.height - janela.height)/2);
    }
}