package PI;

import javax.swing.JOptionPane;

public class TestePolimorfismo {
    public static void main(String[] args) {
        String valores[] = {"Cachorro" , "Gato" , "Leao"};
        Object escolha = JOptionPane.showInputDialog(null, "Escolha um Bicho", "Cadastro de Bichos", JOptionPane.INFORMATION_MESSAGE, null, valores, valores[0]);
        Bicho b;
        if(escolha.equals("Cachorro")) {
            b = new Cachorro();
        }
        else if (escolha.equals("Gato")) {
            b = new Gato();
        }
        else {
            b = new Bicho();
        b.fala();
        }
    }
}
