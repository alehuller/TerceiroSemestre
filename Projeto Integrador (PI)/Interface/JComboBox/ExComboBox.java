package JComboBox;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ExComboBox extends JFrame implements ActionListener, ItemListener {
    JLabel l1;
    JTextField t1, t2, t3;
    JComboBox combo;
    JButton b1,b2,b3,b4,b5,b6; //instanciações

    public static void main(String[] args) {
        new ExComboBox();
    }

    ExComboBox() {
        setTitle("Uso do JComboBox");
        setSize(400, 170);
        getContentPane().setBackground(new Color(190,190,190));
        l1 = new JLabel("Conteúdo");
        l1.setHorizontalAlignment(SwingConstants.CENTER);
        l1.setForeground(Color.blue);
        l1.setFont(new Font("Arial", Font.BOLD, 15));
        t1 = new JTextField(); t2 = new JTextField();
        t1.setHorizontalAlignment(SwingConstants.CENTER);
        t2.setHorizontalAlignment(SwingConstants.CENTER);
        String[] cores = {"Branco", "Vermelho", "Azul", "Verde"};
        combo = new JComboBox(cores);
        combo.addItemListener(this);
        getContentPane().setLayout(new GridLayout(5,2)); //5 linhas e 2 colunas
        getContentPane().add(l1);
        getContentPane().add(combo);
        b1 = criarBotao("Mostra Texto");
        b4 = criarBotao("Remove Item");
        b2 = criarBotao("Mostra Indíce");
        b5 = criarBotao("Remove Todos");
        b3 = criarBotao("Adiciona Item");
        getContentPane().add(t1);
        b6 = criarBotao("Quant. ITens");
        getContentPane().add(t2);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private JButton criarBotao(String texto) {
        JButton botao = new JButton(texto);
        botao.addActionListener(this);
        add(botao);
        return botao;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) 
        l1.setText("Texto: " + combo.getSelectedItem());
        if (e.getSource() == b2)
        l1.setText("Índice: " + combo.getSelectedIndex());
        if (e.getSource() == b3)
        if (t1.getText().length() != 0) {
        combo.addItem(t1.getText()); // adiciona item
        t1.setText(""); // limpa o texto de t1
        } 
        if (e.getSource() == b4)
        combo.removeItemAt(combo.getSelectedIndex()); // remove o item selecionado
        if (e.getSource() == b5)
        combo.removeAllItems(); // remove todos os itens
        if (e.getSource() == b6)
        t2.setText("" + combo.getItemCount()); //conta a quantidade total de itens
    }

    public void itemStateChanged(ItemEvent e) {
        t1.setText("" + combo.getSelectedItem()); //mostra o item selecionado
    }
}
